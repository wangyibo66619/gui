package demo04;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * @author 王艺博
 * @date 2021/5/31 12:55
 */
public class ImageIconDemo extends JFrame {
    public ImageIconDemo(){
        // 获取图片地址
        URL url = ImageIconDemo.class.getResource("1.png");
        JLabel label = new JLabel("ImageIcon");

        ImageIcon imageIcon = new ImageIcon(url);
        label.setIcon(imageIcon);
        label.setHorizontalAlignment(SwingConstants.CENTER);

        Container container = getContentPane();
        container.add(label);

        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new ImageIconDemo();
    }
}
