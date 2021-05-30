package demo01;

import java.awt.*;

/**
 * @author 王艺博
 * @date 2021/5/29 20:08
 */
public class TestFrame02 {
    public static void main(String[] args) {
        MyFrame myFrame1 = new MyFrame(100, 100, 200, 200, Color.CYAN);
        MyFrame myFrame2 = new MyFrame(100, 300, 200, 200, Color.magenta);
        MyFrame myFrame3 = new MyFrame(300, 100, 200, 200, Color.white);
        MyFrame myFrame4 = new MyFrame(300, 300, 200, 200, Color.red);
    }
}

class MyFrame extends Frame {
    static int id = 0;

    public MyFrame(int x,int y,int w,int h,Color color) {
        setBounds(x,y,w,h);
        setBackground(color);
        setVisible(true);
    }
}
