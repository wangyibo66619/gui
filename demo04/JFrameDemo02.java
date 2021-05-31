package demo04;

import javax.swing.*;
import java.awt.*;

/**
 * @author 王艺博
 * @date 2021/5/31 10:04
 */
public class JFrameDemo02 {
    public static void main(String[] args) {
        new MyJFrameDemo2().init();
    }
}
class MyJFrameDemo2 extends JFrame {
    public void init() {
        this.setBounds(1,2,400,400);
        this.setVisible(true);
        JLabel label = new JLabel("你好");
        this.add(label);
        // 让标签居中  设置水平对齐
        label.setHorizontalAlignment(SwingConstants.CENTER);
        // 获得一个容器
        Container container = this.getContentPane();
        container.setBackground(Color.GRAY);
    }
}
