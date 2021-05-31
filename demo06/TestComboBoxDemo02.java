package demo06;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

/**
 * @author 王艺博
 * @date 2021/5/31 21:26
 */
public class TestComboBoxDemo02 extends JFrame {
    public TestComboBoxDemo02() {
        Container container = this.getContentPane();
        // 生成列表的内容
        // String[] contents = {"1","2","3"};
        Vector contents = new Vector();
        // 列表中需要放入内容
        JList jList = new JList(contents);
        contents.add("zhangsan");
        contents.add("dagen");
        contents.add("xiaogen");

        container.add(jList);


        container.add(jList);

        this.setVisible(true);
        this.setSize(500,300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TestComboBoxDemo02();
    }
}
