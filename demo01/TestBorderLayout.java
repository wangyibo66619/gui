package demo01;

import java.awt.*;

/**
 * @author 王艺博
 * @date 2021/5/29 21:55
 */
public class TestBorderLayout {
    public static void main(String[] args) {
        Frame frame = new Frame("haha");

        Button east = new Button("east");
        Button wast = new Button("wast");
        Button north = new Button("north");
        Button south = new Button("south");
        Button center = new Button("center");

        frame.add(east,BorderLayout.EAST);
        frame.add(wast,BorderLayout.WEST);
        frame.add(north,BorderLayout.NORTH);
        frame.add(south,BorderLayout.SOUTH);
        frame.add(center,BorderLayout.CENTER);

        frame.setSize(300,300);
        frame.setVisible(true);



    }
}
