package demo01;

import java.awt.*;

/**
 * @author 王艺博
 * @date 2021/5/29 21:14
 */
// 流式布局
public class TestFlowLayout {
    public static void main(String[] args) {
        Frame frame = new Frame();

        // 组件——按钮
        Button button1 = new Button("button1");
        Button button2 = new Button("button2");
        Button button3 = new Button("button3");

        // 设置为流式布局
        //frame.setLayout(new FlowLayout());
        //frame.setLayout(new FlowLayout(FlowLayout.LEFT));
        frame.setLayout(new FlowLayout(FlowLayout.RIGHT));

        frame.setSize(300,300);
        // 添加按钮
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        // 设置窗口可见度
        frame.setVisible(true);
    }
}
