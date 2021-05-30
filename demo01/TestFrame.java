package demo01;

import java.awt.*;

/**
 * @author 王艺博
 * @date 2021/5/29 19:23
 */
public class TestFrame {
    public static void main(String[] args) {
        // Frame
        Frame frame = new Frame("王艺博");

        // 需要设置可见性
        frame.setVisible(true);

        // 设置窗口大小
        frame.setSize(400,400);
        // 设置背景颜色
        frame.setBackground(new Color(205, 11, 11));
        // 弹出的初始位置
        frame.setLocation(400,400);
        // 设置大小固定
        frame.setResizable(false);
    }
}
