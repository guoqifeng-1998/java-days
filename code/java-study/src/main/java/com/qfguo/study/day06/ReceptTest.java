package com.qfguo.study.day06;

import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.ArrayList;
import java.util.logging.Filter;

/**
 * @ClassName ReceptTest
 * @Description TODO
 * @Author 郭崎锋
 * @Date 2020/10/25
 **/
public class ReceptTest {
    private static final int v1 = 10;
    private static final int v2 = 20;
    private static final int v3 = 30;
    private static final int MAX = 50;

    public static void main(String[] args) {
        ArrayList<User> uList = new ArrayList<>();
        for (int i = 1; i <= MAX; i++) {
          uList.add(new User(i));
        }
        System.out.println("未分组:");
        System.out.println(uList);
        Reception r1 = new Reception();
        Reception r2 = new Reception();
        Reception r3 = new Reception();
        //内部匿名类，更好的方式是使用Lambda表达式
        r1.setF(new Filter() {
            @Override
            public void filterUser(User U) {
                if (U.getId() >= v1 && U.getId() < v2) {
                    U.setType("v1");
                }
            }
        });
        r2.setF(U -> {
            if (U.getId() >= v2 && U.getId() < v3) {
                U.setType("v2");
            }
        });
        for (User user : uList) {
            r1.recept(user);
            r2.recept(user);
            r3.recept(user);
        }
        System.out.println("已分组:");
        for (int i = 0; i < uList.size(); i++) {
            User user = uList.get(i);
            if (i % 9 == 0) {
                System.out.println();
            }
            System.out.println(user + "");
        }
    }

    static class Reception {
        Filter f;

        public Filter getF() {
            return f;
        }

        public void setF(Filter f) {
            this.f = f;
        }

        public void recept(User u) {
            if (u.getType() != null) {
                return;
            }
            if (f != null) {
                f.filterUser(u);
            } else {
                u.setType("A");
            }
        }
    }

    static class User {
        private String type;
        private final int id;

        public User(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return id + "-" + type;
        }
    }

    interface Filter {
        void filterUser(User u);
    }
}
