package demo04;

import javax.swing.*;
import java.awt.*;

/**
 * @author 王艺博
 * @date 2021/5/31 9:45
 */
public class JFrameDemo {
    // 初始化
    public void init() {
        JFrame jf = new JFrame("这是一个JFrame窗口");
        jf.setBounds(1,2,400,400);
        jf.setVisible(true);
        JLabel label = new JLabel("你好");
        jf.add(label);
        // 关闭事件
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new JFrameDemo().init();
    }
}
