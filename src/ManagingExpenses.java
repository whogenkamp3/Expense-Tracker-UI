public class ManagingExpenses {
    private double totalExpense;

    public double getTotalExpense(){
        //return the sum of the expense frome the backend db
        return ;
    } 
    
}




loginButton.addActionListener(new ActionListener()){
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                
                // Database connection parameters
                String url = "jdbc:mysql://liams-mbp.ddns.creighton.edu:3306/expense_tracker_back_end";
                String user = "";
                String dbPassword = "";
                
                try (Connection connection = DriverManager.getConnection(url, user, dbPassword)) {
                    String query = "SELECT username, password FROM users WHERE username = ? AND password = ?";
                    try (PreparedStatement statement = connection.prepareStatement(query)) {
                        statement.setString(1, username);
                        statement.setString(2, password);

                        try (ResultSet result = statement.executeQuery()) {
                            if (result.next()) {
                                // Successful login, show the main UI
                                frame.getContentPane().remove(loginPanel);
                                showMainUI(frame);
                            } else {
                                JOptionPane.showMessageDialog(frame, "Login failed. Please check your credentials.");
                            }
                        }
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        };