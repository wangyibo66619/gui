package demo03;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * @author 王艺博
 * @date 2021/5/31 9:10
 */
public class TestKeyListener {
    public static void main(String[] args) {
        new MyKeyListener();
    }
}
class MyKeyListener extends Frame {
    public MyKeyListener() {
        setBounds(1,2,300,400);
        setBackground(Color.gray);
        setVisible(true);

        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                // 获取键盘下的键是哪一个，当前的码  直接使用静态属性 VK_xxx
                int keyCode = e.getKeyCode();
                if ( keyCode == KeyEvent.VK_UP ) {
                    System.out.println("你按下了上键");
                }
            }
        });
    }
}
