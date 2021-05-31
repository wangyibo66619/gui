package demo05;

import javax.swing.*;
import java.awt.*;

/**
 * @author 王艺博
 * @date 2021/5/31 16:04
 */
public class JScrollDemo extends JFrame {
    public JScrollDemo(){
        Container container = this.getContentPane();

        // 文本域
        TextArea textArea = new TextArea(20,50);

        // Scroll面板
        JScrollPane jScrollPane = new JScrollPane(textArea);
        container.add(jScrollPane);


        this.setVisible(true);
        this.setBounds(100,100,300,300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JScrollDemo();
    }
}
