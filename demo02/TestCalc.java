package demo02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author 王艺博
 * @date 2021/5/30 11:12
 */
// 简易计算器
public class TestCalc {
    public static void main(String[] args) {
        new Calculator().loadFrame();
    }
}
// 计算器类
class Calculator extends Frame {
    TextField num1,num2,sum;
    public void loadFrame() {
        // 文本框
        num1 = new TextField(10);
        num2 = new TextField(10);
        sum = new TextField(20);

        Label label = new Label("+");

        Button button = new Button("=");
        button.addActionListener(new MyActionListener3());
        // 流式布局
        setLayout(new FlowLayout());

        add(num1);
        add(label);
        add(num2);
        add(button);
        add(sum);

        pack();
        setVisible(true);

    }
    // 监听器类   内部类
    private class MyActionListener3 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // 获得加数和被加数
            int n1 = Integer.parseInt(num1.getText());
            int n2 = Integer.parseInt(num2.getText());

            sum.setText("" + (n1+n2));

            num1.setText("");
            num2.setText("");

        }
    }
}


