import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


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
        setMaximumSize(new Dimension(700, 550));
        setIconImage(logo.getImage());

        // Create the card layout and panel to switch between login and main UI
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        // Login panel
        JPanel loginPanel = createLoginPanel(logo);

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




    private JPanel createLoginPanel(ImageIcon logo) {
        // JPanel that other specific components will be added to, this panel is returned
        JPanel loginPanel = new JPanel(new GridLayout(5,3));
        loginPanel.setBackground(Color.LIGHT_GRAY);

        JPanel titlePanel = new JPanel();
        titlePanel.setBackground(Color.BLACK);
        

        JPanel titleContent = new JPanel();
        JLabel title = new JLabel("Welcome to Lifebloods Expense Tracker Software");
        titleContent.setBackground(Color.LIGHT_GRAY);
        title.setFont(titleFont);
        titleContent.add(title);
        titlePanel.add(titleContent); 





        loginPanel.add(titlePanel);
        JPanel imagePanel = new JPanel();
        loginPanel.add(imagePanel);







        // //creating the title Panel and adding the JLabel containing what is displayed
        // JPanel titlePanel = new JPanel();
        // //titlePanel.setBounds(0,0,700,20);
        // titlePanel.setBackground(Color.GRAY);
        // JLabel title = new JLabel("Welcome to Lifebloods Expense Tracker Software");
        // title.setFont(titleFont);
        // titlePanel.add(title);
        // loginPanel.add(titlePanel, BorderLayout.NORTH);


        //creating the image panel and adding the image icon onto a JLabel that is posted to the main panel
        //JPanel imagePanel = new JPanel();
        //imagePanel.setBounds(350,50,100,50);
        //imagePanel.setBackground(Color.GRAY);
        // JLabel image = new JLabel();
        // image.setIcon(logo);
        // //imagePanel.add(image);
        // loginPanel.add(image);

        // //creating the panel for username and password feilds
        // JPanel user_passJPanel = new JPanel();
        // user_passJPanel.setBounds(350,-700,100,50);
        // user_passJPanel.setBackground(Color.GRAY);
        // //creating username JLabel and setting font
        // JLabel usernameLabel = new JLabel("Username");
        // usernameLabel.setFont(bodyFont);
        // user_passJPanel.add(usernameLabel);

        // JPanel user_feild_JPanel = new JPanel();
        // user_feild_JPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        // user_feild_JPanel.setBackground(Color.GRAY);

        // //creating username textfield and setting font
        // usernameField = new JTextField(15);
        // usernameField.setFont(bodyFont);
        // user_feild_JPanel.add(usernameField);

        
        // //creating password JLabel and setting font
        // JLabel passwordLabel = new JLabel("Password");
        // passwordLabel.setFont(bodyFont);

        // //creating password textfield and setting font
        // passwordField = new JPasswordField(15);
        // passwordField.setFont(bodyFont);

        // loginPanel.add(user_passJPanel);
        // loginPanel.add(user_feild_JPanel);
        

        // //JPanel formPanel = new JPanel(new GridBagLayout());
        // //formPanel.add(usernameLabel);
        // //formPanel.add(usernameField );
        // //formPanel.add(passwordLabel );
        // //formPanel.add(passwordField);

    

        // JButton loginButton = new JButton("Login");
        // loginButton.setFont(bodyFont);

        // //JPanel centerPanel = new JPanel();
        // //centerPanel.add(loginButton);

        

        // loginButton.addActionListener(new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         String username = usernameField.getText();
        //         String password = new String(passwordField.getText());
                
        //         // Call the loginStatus method on the Login instance
        //         boolean loginStatus = Login.loginStatus(username, password);
                
        //         if (loginStatus) {
        //             // Successful login, switch to the main UI panel
        //             cardLayout.show(cardPanel, "main");
        //         } else {
        //             JOptionPane.showMessageDialog(MainFrame.this, "Login failed. Please check your credentials.");
        //         }
        //     }
        // });

        // //loginPanel.add(title, BorderLayout.NORTH);
        

        
        

        return loginPanel;
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






