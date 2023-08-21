package Java.GUI;

import javax.swing.*;
 
public class SwingByInheritance extends JFrame {

    JFrame frame;

    // constructor 
    SwingByInheritance() {
        JButton button = new JButton("Submit");
        add(button);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SwingByInheritance();
    }
}
