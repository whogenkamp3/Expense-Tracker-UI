import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::initGUI);
    }

    private static void initGUI() {
        JFrame myFrame = new JFrame("Investment Portfolio");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setLayout(new BorderLayout());

        JPanel topLeftPanel = new JPanel(new GridBagLayout());
        myFrame.add(topLeftPanel, BorderLayout.CENTER);
        topLeftPanel.setBorder(BorderFactory.createTitledBorder("Buying an investment"));
        GridBagConstraints labelConstraints = new GridBagConstraints();
        labelConstraints.anchor = GridBagConstraints.WEST;
        labelConstraints.gridx = 0;
        labelConstraints.gridy = 0;
        labelConstraints.weightx = 0.5;
        labelConstraints.weighty = 1;
        labelConstraints.insets = new Insets(5, 10, 5, 10);
        GridBagConstraints fieldConstraints = new GridBagConstraints();
        fieldConstraints.anchor = GridBagConstraints.WEST;
        fieldConstraints.gridx = 1;
        fieldConstraints.gridy = 0;
        fieldConstraints.weightx = 0.5;
        fieldConstraints.weighty = 1;
        fieldConstraints.insets = new Insets(5, 10, 5, 10);
        topLeftPanel.add(new JLabel("Type"), labelConstraints);
        JComboBox<String> typeSelect = new JComboBox<>(new String[] { "stock", "aaaaaaaa" });
        topLeftPanel.add(typeSelect, fieldConstraints);
        labelConstraints.gridy =10;
        topLeftPanel.add(new JLabel("Symbol"), labelConstraints);
        JTextField symbolField = new JTextField(10);
        fieldConstraints.gridy++;
        topLeftPanel.add(symbolField, fieldConstraints);
        labelConstraints.gridy++;
        topLeftPanel.add(new JLabel("Name"), labelConstraints);
        JTextField nameField = new JTextField(20);
        fieldConstraints.gridy++;
        topLeftPanel.add(nameField, fieldConstraints);
        labelConstraints.gridy++;
        topLeftPanel.add(new JLabel("Quantity"), labelConstraints);
        JTextField quantityField = new JTextField(6);
        fieldConstraints.gridy++;
        topLeftPanel.add(quantityField, fieldConstraints);
        labelConstraints.gridy++;
        topLeftPanel.add(new JLabel("Price"), labelConstraints);
        JTextField priceField = new JTextField(6);
        fieldConstraints.gridy++;
        topLeftPanel.add(priceField, fieldConstraints);

        JPanel topRightPanel = new JPanel(new GridBagLayout());
        topRightPanel.setBorder(BorderFactory.createEmptyBorder());
        myFrame.add(topRightPanel, BorderLayout.EAST);
        GridBagConstraints buttonConstraints = new GridBagConstraints();
        buttonConstraints.fill = GridBagConstraints.HORIZONTAL;
        buttonConstraints.insets = new Insets(10, 10, 10, 10);
        buttonConstraints.weighty = 1;
        buttonConstraints.gridy = 0;
        JButton reset = new JButton("Reset");
        topRightPanel.add(reset, buttonConstraints);
        JButton buy = new JButton("Buy");
        buttonConstraints.gridy++;
        topRightPanel.add(buy, buttonConstraints);

        JPanel bottomPanel = new JPanel(new BorderLayout());
        myFrame.add(bottomPanel, BorderLayout.SOUTH);
        bottomPanel.setBorder(BorderFactory.createTitledBorder("Messages"));
        JTextArea messagesArea = new JTextArea(6, 30);
        bottomPanel.add(new JScrollPane(messagesArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS), BorderLayout.CENTER);

        myFrame.pack();
        myFrame.setVisible(true);
    }
}