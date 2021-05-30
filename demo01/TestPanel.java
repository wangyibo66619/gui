package demo01;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author 王艺博
 * @date 2021/5/29 20:37
 */
// Panel 可以看成一个空间，但是不能单独存在
public class TestPanel {
    public static void main(String[] args) {
        Frame frame = new Frame();
        // 布局的概念
        Panel panel = new Panel();// 面板

        // 设置布局
        frame.setLayout(null);
        // 坐标
        frame.setBounds(300,300,500,500);
        frame.setBackground(new Color(217, 217, 162));
        // Panel设置坐标 相对于Frame
        panel.setBounds(50,50,300,300);
        panel.setBackground(new Color(194, 107, 107));

        //frame.add()
        frame.add(panel);
        // 可见的
        frame.setVisible(true);
        // 监听事件，监听窗口关闭事件  System.exit(0)
        frame.addWindowListener(new WindowAdapter() {
            // 窗口关闭的时候需要做的事情
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
