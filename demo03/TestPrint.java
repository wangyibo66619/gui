package demo03;

import java.awt.*;

/**
 * @author 王艺博
 * @date 2021/5/30 15:33
 */
public class TestPrint {
    public static void main(String[] args) {
        new paint().loadFrame();
    }
}

class paint extends Frame {
    public void loadFrame() {
        setBounds(200,200,500,500);
        setVisible(true);
    }
    // 画笔

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillOval(100,100,100,100);
    }
}
