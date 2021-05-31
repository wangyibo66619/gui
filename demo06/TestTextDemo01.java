package demo06;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

/**
 * @author 王艺博
 * @date 2021/5/31 21:42
 */
public class TestTextDemo01 extends JFrame {
    public TestTextDemo01() {
        Container container = this.getContentPane();

        JTextField textField = new JTextField("hello",20);
        JTextField textField2 = new JTextField("world",20);

        container.add(textField,BorderLayout.NORTH);
        container.add(textField2,BorderLayout.SOUTH);

        this.setVisible(true);
        this.setSize(500,300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TestTextDemo01();
    }
}
