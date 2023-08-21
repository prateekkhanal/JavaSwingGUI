package Java.GUI;

import javax.swing.*;

public class SwingByAssociation {
    SwingByAssociation() {
        // create a frame object
        JFrame frame = new JFrame("Calculator");
        // create a button
        JButton button = new JButton("Click me");
        frame.add(button);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new SwingByAssociation();
    }
}
