import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.example.myproject.LoginPanel;


public class MainFrame extends JFrame {

    Login login = new Login();

    //title and body fonts used throughtout UI
    final private Font titleFont = new Font("Segoe print", Font.BOLD, 25);
    final private Font bodyFont = new Font("Segoe print", Font.PLAIN, 12);

    JTextField usernameField, passwordField;
    JPanel cardPanel;
    CardLayout cardLayout;

    public void createAndShowUI() {
        //Logo Image used on login page of UI
        ImageIcon logo = new ImageIcon(new ImageIcon("/Users/whogenkamp3/Visual Studio Code/Java Projects/Expense_UI/lib/logo.png").getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));

        //creating default frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 550);
        setMinimumSize(new Dimension(700, 550));
        //setMaximumSize(new Dimension(700, 550));
        setIconImage(logo.getImage());

        // Create the card layout and panel to switch between login and main UI
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        // Login panel
        JPanel loginPanel = new LoginPanel().createLoginPanel(logo, titleFont);


        // Main UI panel
        JPanel mainUIPanel = createMainUIPanel();

        JPanel managing_expenses_UI_Panel = createExpensePanel();

        cardPanel.add(loginPanel, "login");
        cardPanel.add(mainUIPanel, "main");
        cardPanel.add(managing_expenses_UI_Panel, "expense_management");

        

        // Show the login panel initially
        cardLayout.show(cardPanel, "login");

        getContentPane().add(cardPanel);
        setVisible(true);
    }

    private JPanel createExpensePanel(){
        JLabel title = new JLabel("Welcome to Lifebloods Expense Tracker Software");


        // Create a JMenuBar
        JMenuBar menuBar = new JMenuBar();
    
        // Create a JMenu for the dropdown menu
        JMenu mainMenu = new JMenu("Menu");
    
        // Create JMenuItems for the dropdown menu
        JMenuItem menuItem1 = new JMenuItem("Home Page");
        JMenuItem menuItem2 = new JMenuItem("Item 2");
        JMenuItem menuItem3 = new JMenuItem("Item 3");
    
        // Add ActionListeners to the menu items (if needed)
        menuItem1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Perform action for Item 1
                cardLayout.show(cardPanel, "main");
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



        JPanel managing_expenses_UI_Panel = new JPanel();
        managing_expenses_UI_Panel.add(menuBar, BorderLayout.NORTH);
        managing_expenses_UI_Panel.add(title);
        

        return managing_expenses_UI_Panel;

    }




   

   

    private JPanel createMainUIPanel() {

        // Create the main UI panel
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.LIGHT_GRAY);
    
        // Create a JMenuBar
        JMenuBar menuBar = new JMenuBar();
    
        // Create a JMenu for the dropdown menu
        JMenu mainMenu = new JMenu("Menu");
    
        // Create JMenuItems for the dropdown menu
        JMenuItem menuItem1 = new JMenuItem("Expense Management");
        JMenuItem menuItem2 = new JMenuItem("Item 2");
        JMenuItem menuItem3 = new JMenuItem("Item 3");
    
        // Add ActionListeners to the menu items (if needed)
        menuItem1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Perform action for Item 1
                cardLayout.show(cardPanel, "expense_management");
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

        
    
        // Set the JMenuBar for the main panel
        mainPanel.add(menuBar);

    
        // Add other components or content to the main UI panel as needed
        JLabel welcomeLabel = new JLabel("Expense Tracker");
        mainPanel.add(welcomeLabel);
    
        return mainPanel;
    }
    

    public static void main(String[] args) {
        MainFrame myFrame = new MainFrame();
        myFrame.createAndShowUI();
    }
}






