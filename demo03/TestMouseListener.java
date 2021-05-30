package demo03;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author 王艺博
 * @date 2021/5/30 16:04
 */
// 鼠标监听事件
public class TestMouseListener {
    public static void main(String[] args) {
        new MyFrame("画图");
    }
}
class MyFrame extends Frame {
    // 画画需要画笔，需要监听鼠标当前的位置，需要集合存储这个点
    ArrayList points;
    public MyFrame(String title) {
        // 存鼠标点击的点
        super(title);
        points = new ArrayList<>();
        setBounds(200,200,400,400);
        setVisible(true);
        // 鼠标监听器,正对这个窗口
        this.addMouseListener(new MyMouseListener());
    }

    @Override
    public void paint(Graphics g) {
        // 画画，监听鼠标的事件
        Iterator iterator = points.iterator();
        while (iterator.hasNext()) {
            Point points = (Point) iterator.next();
            g.setColor(Color.red);
            g.fillOval(points.x,points.y,10,10);
        }
    }
    // 添加一个点到界面上
    public void addPoint(Point point) {
        points.add(point);
    }


    private class MyMouseListener extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            // 我们点击的时候，就会在界面产生一个点
            MyFrame frame = (MyFrame) e.getSource();
            // 这个点就是鼠标的点
            frame.addPoint(new Point(e.getX(), e.getY()));
            // 每次点击鼠标都需要重新画一次
            frame.repaint();// 刷新

        }
    }
}