    private JPanel createLoginPanel(ImageIcon logo) {


        //creating username JLabel and setting font
        JLabel usernameLabel = new JLabel("Username");
        usernameLabel.setFont(bodyFont);

        //creating username textfield and setting font
        usernameField = new JTextField(15);
        usernameField.setFont(bodyFont);
        
        //creating password JLabel and setting font
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setFont(bodyFont);

        //creating password textfield and setting font
        passwordField = new JPasswordField(15);
        passwordField.setFont(bodyFont);
        

        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.add(usernameLabel);
        formPanel.add(usernameField );
        formPanel.add(passwordLabel );
        formPanel.add(passwordField);

        JLabel title = new JLabel("Welcome to Lifebloods Expense Tracker Software");
        title.setFont(titleFont);
        JLabel image = new JLabel();
        image.setIcon(logo);
        image.setBorder(BorderFactory.createLineBorder(Color.black));

        JPanel northPanel = new JPanel();
        northPanel.add(title);

        JButton loginButton = new JButton("Login");
        loginButton.setFont(bodyFont);

        JPanel centerPanel = new JPanel();
        centerPanel.add(loginButton);

        JPanel loginPanel = new JPanel(new GridLayout());
        loginPanel.setBackground(Color.LIGHT_GRAY);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getText());
                
                // Call the loginStatus method on the Login instance
                boolean loginStatus = Login.loginStatus(username, password);
                
                if (loginStatus) {
                    // Successful login, switch to the main UI panel
                    cardLayout.show(cardPanel, "main");
                } else {
                    JOptionPane.showMessageDialog(MainFrame.this, "Login failed. Please check your credentials.");
                }
            }
        });
        

        loginPanel.add(northPanel);
        loginPanel.add(image);
        loginPanel.add(formPanel);
        loginPanel.add(centerPanel);  
        

        return loginPanel;
    }