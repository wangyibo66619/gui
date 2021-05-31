package demo03;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author 王艺博
 * @date 2021/5/30 21:50
 */
public class TestWindows {
    public static void main(String[] args) {
        new MyWindowsListener();
    }
}
class MyWindowsListener extends Frame {
    public MyWindowsListener(){
        setBounds(200,200,300,300);
        setBackground(Color.GRAY);
        setVisible(true);

        this.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("关闭");
                System.exit(0);
            }

            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("jihuo");
            }

        });
    }
}
