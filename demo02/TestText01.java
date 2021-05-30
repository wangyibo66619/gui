package demo02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author 王艺博
 * @date 2021/5/30 10:06
 */
public class TestText01 {
    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();
    }
}

class MyFrame extends Frame {
    public MyFrame() {
        TextField textField = new TextField();
        add(textField);
        // 监听这个文本框输入的文字
        MyActionListener2 myActionListener2 = new MyActionListener2();
        // 按下enter 就会触发输入框的事件
        textField.addActionListener(myActionListener2);
        // 设置替换编码
        textField.setEchoChar('*');
        setVisible(true);
        pack();
    }
}

class MyActionListener2 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        TextField textField = (TextField) e.getSource();// 获得一些资源，返回一个对象
        System.out.println(textField.getText());//获得文本框内容
        textField.setText("");
    }
}

