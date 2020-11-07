package com.qfguo.study.day19.frame;


import com.qfguo.study.day19.test.*;

import javax.swing.*;
import java.awt.print.Book;

/**
 * @ClassName StudentFrame
 * @Description TODO
 * @Author yuanFangT
 * @Date 2020/11/7
 **/
public class StudentFrame {
    private JPanel mainPanel;
    private JButton button3;
    private JButton button4;
    private JPanel centerPanel;
    private JPanel topPanel;
    private JButton button1;
    private JButton button5;
    private JButton button6;
    private JPanel leftPanel;
    private JTextField nameField;
    private JTextField priceField;
    private JButton check;
    private JTextField numFiled;
    private JLabel resultLabel;


    public StudentFrame() {
        check.addActionListener(e -> {
            System.out.println("点击");
            String num = numFiled.getText();
            String name = nameField.getText();
            String price = priceField.getText();
            com.qfguo.study.day19.test.Book book = new Book(num,name,Integer.parseInt(price));
            BookService bs = new BookServiceImpl();
            boolean b = false;
            try {
                b = bs.putOnSale(book);
            } catch (ISBNException | BookNameException | PriceException ee) {
                JOptionPane.showMessageDialog(null,"上架未通过");
                resultLabel.setText(book.getBookName() + "上架未通过");
            }finally {
                numFiled.setText("");
                nameField.setText("");
                priceField.setText("");
            }
            if (b){
                JOptionPane.showMessageDialog(null,"上架通过");
                resultLabel.setText(book.getBookName() + "上架通过");
            }
        });
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("StudentFrame");
        frame.setContentPane(new StudentFrame().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setLocationRelativeTo(null);
        //frame.pack();
        frame.setVisible(true);
    }
}
