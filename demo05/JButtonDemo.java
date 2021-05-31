package demo05;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * @author 王艺博
 * @date 2021/5/31 19:16
 */
public class JButtonDemo extends JFrame {
    public JButtonDemo(){
        Container container = this.getContentPane();
        // 将一个图片变成图标
        URL url = JButtonDemo.class.getResource("2.png");
        ImageIcon imageIcon = new ImageIcon(url);
        // 把图标放在按钮上
        JButton jButton = new JButton();
        jButton.setIcon(imageIcon);
        jButton.setToolTipText("图片按钮");

        container.add(jButton);


        this.setVisible(true);
        this.setBounds(200,200,500,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JButtonDemo();
    }
}
