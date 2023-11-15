import javax.swing.*;
import java.awt.*;

public class test {

    public static void main(String[] args) {
        // Create the JFrame
        JFrame frame = new JFrame("GridLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create components
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");

        // Create a layout manager (GridLayout) with 2 rows and 3 columns
        GridLayout layout = new GridLayout(2, 3, 10, 10);
        frame.setLayout(layout);

        // Add components to the frame using the layout manager
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);

        // Make the frame visible
        frame.setVisible(true);
    }
}
