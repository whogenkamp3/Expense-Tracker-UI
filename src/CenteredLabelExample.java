import javax.swing.*;
import java.awt.*;

public class CenteredLabelExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Centered JLabel Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);

            JPanel panel = new JPanel(new GridBagLayout());

            // Create a JLabel
            JLabel label = new JLabel("Centered Label");
            
            // Create GridBagConstraints for centering
            GridBagConstraints constraints = new GridBagConstraints();
            constraints.gridx = 0;
            constraints.gridy = 0;
            constraints.weightx = 1.0;
            constraints.weighty = 1.0;
            constraints.fill = GridBagConstraints.CENTER;
            
            panel.add(label, constraints);
            
            frame.add(panel);
            frame.setVisible(true);
        });
    }
}

