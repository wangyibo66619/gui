package demo06;

import javax.swing.*;
import java.awt.*;

/**
 * @author 王艺博
 * @date 2021/5/31 21:48
 */
public class TestTextDemo02 extends JFrame {
    public TestTextDemo02() {
        Container container = this.getContentPane();

        JPasswordField passwordField = new JPasswordField(20);
        passwordField.setEchoChar('王');
        container.add(passwordField,BorderLayout.NORTH);


        this.setVisible(true);
        this.setSize(500,300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TestTextDemo02();
    }
}
