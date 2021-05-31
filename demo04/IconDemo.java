package demo04;

import javax.swing.*;
import java.awt.*;

/**
 * @author 王艺博
 * @date 2021/5/31 11:00
 */
public class IconDemo extends JFrame implements Icon {
    private int weight;
    private int height;

    public IconDemo(){
    }

    public IconDemo(int weight, int height){
        this.weight = weight;
        this.height = height;
    }

    public void init() {
        IconDemo iconDemo = new IconDemo(15,15);
        // 图标放在标签，也可以放在按钮上！
        JLabel label = new JLabel("icontest", iconDemo, SwingConstants.CENTER);
        Container container = getContentPane();
        container.add(label);

        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new IconDemo().init();
    }





    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.fillOval(x,y,weight,height);
    }

    @Override
    public int getIconWidth() {
        return weight;
    }

    @Override
    public int getIconHeight() {
        return height;
    }
}
