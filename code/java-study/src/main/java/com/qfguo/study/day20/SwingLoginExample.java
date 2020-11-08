package com.qfguo.study.day20;

import javax.swing.*;

/**
 * @ClassName SwingLoginExample
 * @Description 一个用户登录框实例
 * @Author 郭崎锋
 * @Date 2020/11/8
 **/
public class SwingLoginExample {

    public static void main(String[] args) {
        // 创建JFrame实例
        JFrame frame = new JFrame("Login Example");
        // 设置窗体的宽和高
        frame.setSize(350,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /* 创建面板，类似于HTML的div标签
        * 我们可以创建多个面板并在JFrame中指定位置
        * 面板中我们可以添加文本字段，按钮及其组件。
        * */
        JPanel panel = new JPanel();
        // 添加面板
        frame.add(panel);
        /*
        * 调用用户定义的方法并添加组件到面板
        * */
        placeComponents(panel);

        // 设置界面可见
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel){
        panel.setLayout(null);

        // 创建JLabel
        JLabel userLabel = new JLabel("User:");

        /* 这个方法定义了组件的位置
        *  setBounds(x,y,width,height)
        *  x 和 y 指定左上角的新位置，由width和height指定新的大小
        * */
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

        /*
        * 创建文本域用于用户输入
        * */
        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        // 输入密码的文本域
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        /*
        * 类似输入文本域
        * 输入的信息以点号替代，增强安全新
        * */
        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        // 创建登录按钮
        JButton loginButton = new JButton("login");
        loginButton.setBounds(10, 80, 80, 25);
        panel.add(loginButton);
    }
}
