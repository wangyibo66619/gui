package demo01;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author 王艺博
 * @date 2021/5/29 22:33
 */
public class demo {
    public static void main(String[] args) {
        Frame frame = new Frame("ddd");
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setLocation(300,300);
        frame.setBackground(Color.BLACK);
        frame.setLayout(new GridLayout(2,1));
        // 4个面板
        Panel p1 = new Panel(new BorderLayout());
        Panel p2 = new Panel(new GridLayout(2, 1));
        Panel p3 = new Panel(new BorderLayout());
        Panel p4 = new Panel(new GridLayout(2, 1));

        p1.add(new Button("east-1"),BorderLayout.EAST);
        p2.add(new Button("p2-btn-1"));
        p2.add(new Button("p2-btn-2"));
        p1.add(p2,BorderLayout.CENTER);
        p1.add(new Button("wast-1"),BorderLayout.WEST);

        p3.add(new Button("east-2"),BorderLayout.EAST);
        for (int i = 0; i < 4; i++) {
            p4.add(new Button("p4-btn-" + (i+1)));
        }
        p3.add(p4,BorderLayout.CENTER);
        p3.add(new Button("wast-2"),BorderLayout.WEST);

        frame.add(p1);
        frame.add(p3);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
