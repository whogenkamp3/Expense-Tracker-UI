import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class MainFrame extends JFrame{

    final private Font titleFont = new Font("Segoe print", Font.BOLD, 20);
    final private Font bodyFont = new Font("Segoe print", Font.PLAIN, 12);
    JTextField usernamField, passworField;
    


    public void createAndShowUI() {

        ImageIcon logo = new ImageIcon(new ImageIcon("/Users/whogenkamp3/Visual Studio Code/Java Projects/Expense_UI/lib/logo.png").getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));

        // Main frame for login page
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(550, 300);
        frame.setMinimumSize(new Dimension(550,500));
        frame.setMaximumSize(new Dimension(550,500 ));

        frame.setIconImage(logo.getImage());

        //form panel with login credentials 
        JLabel usernameLabel = new JLabel("Username");
        usernameLabel.setFont(bodyFont); 
        JTextField usernameField = new JTextField(15);
        usernameField.setFont(bodyFont);


        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setFont(bodyFont);
        JPasswordField passwordField = new JPasswordField(15);
        passwordField.setFont(bodyFont);

        JPanel formPanel = new JPanel();
        formPanel.add(usernameLabel);
        formPanel.add(usernameField);
        formPanel.add(passwordLabel);
        formPanel.add(passwordField);


        
        //north panel with title for login
        JLabel title = new JLabel("Welcome to Lifebloods Expense Tracker Software");
        title.setFont(titleFont);
        JLabel image = new JLabel();
        image.setIcon(logo);

        JPanel northPanel = new JPanel();
        northPanel.add(title);
        

        //center panel with login button
        JButton loginButton = new JButton("Login");
        loginButton.setFont(bodyFont);

        JPanel centerPanel = new JPanel();
        centerPanel.add(loginButton);


        JPanel loginPanel = new JPanel();
        loginPanel.setBackground(Color.LIGHT_GRAY);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                if (username.equals("whogenkamp3") && password.equals("Hogenkamp11")) {
                    // Successful login, show the main UI
                    frame.getContentPane().remove(loginPanel);
                    showMainUI(frame);
                } else {
                    JOptionPane.showMessageDialog(frame, "Login failed. Please check your credentials.");
                }
            }
        });


        




        





        loginPanel.add(northPanel);
        loginPanel.add(image);
        loginPanel.add(formPanel);
        loginPanel.add(centerPanel);

        validate();

        frame.add(loginPanel);

        frame.setVisible(true);
    }

    public static void showMainUI(JFrame frame) {
        JFrame mainFrame = new JFrame("Home Page");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(500, 500);
        mainFrame.setMinimumSize(new Dimension(500, 500));
        mainFrame.setMaximumSize(new Dimension(500, 500));

        // Create a JMenuBar
        JMenuBar menuBar = new JMenuBar();

        // Create a JMenu for the dropdown menu
        JMenu mainMenu = new JMenu("Menu");

        // Create JMenuItems for the dropdown menu
        JMenuItem menuItem1 = new JMenuItem("Item 1");
        JMenuItem menuItem2 = new JMenuItem("Item 2");
        JMenuItem menuItem3 = new JMenuItem("Item 3");

        // Add ActionListeners to the menu items (if needed)
        menuItem1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Perform action for Item 1
            }
        });

        menuItem2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Perform action for Item 2
            }
        });

        menuItem3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Perform action for Item 3
            }
        });

        // Add menu items to the JMenu
        mainMenu.add(menuItem1);
        mainMenu.add(menuItem2);
        mainMenu.add(menuItem3);

        // Add the JMenu to the JMenuBar
        menuBar.add(mainMenu);

        // Set the JMenuBar for the main frame
        mainFrame.setJMenuBar(menuBar);

        // Create the main UI panel and add your components
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.LIGHT_GRAY);
        JLabel welcomeLabel = new JLabel("Expense Tracker");
        mainPanel.add(welcomeLabel);

        mainFrame.add(mainPanel);

        mainFrame.setVisible(true);
    }
        

    

    public static void main(String[]args){
        MainFrame myFrame = new MainFrame();
        myFrame.createAndShowUI();
    }

    
    
}






