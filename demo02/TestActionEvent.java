package demo02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author 王艺博
 * @date 2021/5/30 9:20
 */
public class TestActionEvent {
    public static void main(String[] args) {
        // 按下按钮，触发一些事件
        Frame frame = new Frame();
        Button btn = new Button("dianwo");

        MyActionListener myActionListener = new MyActionListener();
        btn.addActionListener(myActionListener);

        frame.add(btn,BorderLayout.CENTER);
        frame.setVisible(true);
        frame.pack();

    }
}
// 事件监听
class MyActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}

