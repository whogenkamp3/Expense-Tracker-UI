package com.example.myproject;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPanel {
    public JPanel createLoginPanel(ImageIcon logo, Font titleFont) {
        // JPanel that other specific components will be added to, this panel is returned
        JPanel loginPanel = new JPanel(new GridLayout(5,4));
        loginPanel.setBackground(Color.LIGHT_GRAY);

        JPanel titlePanel = new JPanel();
        titlePanel.setBackground(Color.BLACK);
        Border border = BorderFactory.createLineBorder(Color.BLACK, 23);
        

        JPanel titleContent = new JPanel();
        JLabel title = new JLabel("Welcome to Lifebloods Expense Tracker Software");
        titleContent.setBackground(Color.LIGHT_GRAY);
        title.setFont(titleFont);
        titleContent.add(title);
        titleContent.setBorder(border);
        titlePanel.add(titleContent); 
        loginPanel.add(titlePanel);


        JPanel imagePanel = new JPanel();
        imagePanel.setBounds(350,50,100,50);
        imagePanel.setBackground(Color.GRAY);
        JLabel image = new JLabel();
        image.setIcon(logo);
        imagePanel.add(image);
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
}
