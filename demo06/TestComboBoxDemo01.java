package demo06;

import javax.swing.*;
import java.awt.*;

/**
 * @author 王艺博
 * @date 2021/5/31 21:00
 */
// 下拉框
public class TestComboBoxDemo01 extends JFrame {
    public TestComboBoxDemo01() {
        Container container = this.getContentPane();
        JComboBox comboBox = new JComboBox();
        comboBox.addItem("根");
        comboBox.addItem("大根");
        comboBox.addItem("小根");
        comboBox.addItem("小小根");

        container.add(comboBox);

        this.setVisible(true);
        this.setSize(500,300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TestComboBoxDemo01();
    }
}
