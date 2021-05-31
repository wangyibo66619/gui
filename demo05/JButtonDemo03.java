package demo05;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * @author 王艺博
 * @date 2021/5/31 19:16
 */
public class JButtonDemo03 extends JFrame {
    public JButtonDemo03(){
        Container container = this.getContentPane();
        // 将一个图片变成图标
        URL url = JButtonDemo.class.getResource("2.png");
        ImageIcon imageIcon = new ImageIcon(url);
        // 多选框
        JCheckBox jCheckBox01 = new JCheckBox("jCheckBox01");
        JCheckBox jCheckBox02 = new JCheckBox("jCheckBox02");

        container.setLayout(new FlowLayout());
        container.add(jCheckBox01);
        container.add(jCheckBox02);

        this.setVisible(true);
        this.setBounds(200,200,500,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JButtonDemo03();
    }
}
