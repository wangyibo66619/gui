package demo05;

import javax.swing.*;
import java.awt.*;

/**
 * @author 王艺博
 * @date 2021/5/31 15:44
 */
public class JPanelDemo extends JFrame {
    public JPanelDemo() {
        Container container = this.getContentPane();

        container.setLayout(new GridLayout(2,1,10,10));// 后面参数的意思是间距

        JPanel jPanel1 = new JPanel(new GridLayout(1,3));
        JPanel jPanel2 = new JPanel(new GridLayout(1,3));
        JPanel jPanel3 = new JPanel(new GridLayout(1,2));
        JPanel jPanel4 = new JPanel(new GridLayout(2,1));

        Button btn1 = new Button("btn1");
        Button btn2 = new Button("btn2");
        Button btn3 = new Button("btn3");
        jPanel1.add(btn1);
        jPanel1.add(btn2);
        jPanel1.add(btn3);
        Button btn4 = new Button("btn4");
        Button btn5 = new Button("btn5");
        Button btn6 = new Button("btn6");
        jPanel2.add(btn4);
        jPanel2.add(btn5);
        jPanel2.add(btn6);
        Button btn7 = new Button("btn7");
        Button btn8 = new Button("btn8");
        jPanel3.add(btn7);
        jPanel3.add(btn8);
        Button btn9 = new Button("btn9");
        Button btn10 = new Button("btn10");
        jPanel4.add(btn9);
        jPanel4.add(btn10);

        container.add(jPanel1);
        container.add(jPanel2);
        container.add(jPanel3);
        container.add(jPanel4);

        this.setVisible(true);
        this.setBounds(300,300,400,400);
        container.setBackground(Color.RED);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
        new JPanelDemo();
    }
}
