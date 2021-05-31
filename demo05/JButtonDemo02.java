package demo05;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * @author 王艺博
 * @date 2021/5/31 19:16
 */
public class JButtonDemo02 extends JFrame {
    public JButtonDemo02(){
        Container container = this.getContentPane();
        // 将一个图片变成图标
        URL url = JButtonDemo.class.getResource("2.png");
        ImageIcon imageIcon = new ImageIcon(url);
        // 单选框
        JRadioButton radioButton1 = new JRadioButton("JRadioButton1");
        JRadioButton radioButton2 = new JRadioButton("JRadioButton2");
        JRadioButton radioButton3 = new JRadioButton("JRadioButton3");

        // 由于单选框只能选择一个，分组,一个组中只能选择一个
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);

        container.add(radioButton1,BorderLayout.CENTER);
        container.add(radioButton2,BorderLayout.NORTH);
        container.add(radioButton3,BorderLayout.SOUTH);

        this.setVisible(true);
        this.setBounds(200,200,500,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JButtonDemo02();
    }
}
