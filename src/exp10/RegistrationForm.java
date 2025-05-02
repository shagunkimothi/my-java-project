package exp10;
import javax.swing.*;

class RegistrationForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Registration Form");
        JLabel nameLabel = new JLabel("Name:");
        JLabel emailLabel = new JLabel("Email:");
        JLabel passLabel = new JLabel("Password:");
        JLabel confirmPassLabel = new JLabel("Confirm Password:");

        JTextField nameField = new JTextField();
        JTextField emailField = new JTextField();
        JPasswordField passField = new JPasswordField();
        JPasswordField confirmPassField = new JPasswordField();
        JButton registerButton = new JButton("Register");

        nameLabel.setBounds(50, 30, 150, 25);
        emailLabel.setBounds(50, 70, 150, 25);
        passLabel.setBounds(50, 110, 150, 25);
        confirmPassLabel.setBounds(50, 150, 150, 25);

        nameField.setBounds(200, 30, 200, 25);
        emailField.setBounds(200, 70, 200, 25);
        passField.setBounds(200, 110, 200, 25);
        confirmPassField.setBounds(200, 150, 200, 25);
        registerButton.setBounds(200, 190, 100, 30);

        frame.add(nameLabel); frame.add(nameField);
        frame.add(emailLabel); frame.add(emailField);
        frame.add(passLabel); frame.add(passField);
        frame.add(confirmPassLabel); frame.add(confirmPassField);
        frame.add(registerButton);

        registerButton.addActionListener(e -> {
            String name = nameField.getText();
            String email = emailField.getText();
            String pass = new String(passField.getPassword());
            String confirmPass = new String(confirmPassField.getPassword());
            
            if (name.isEmpty() || email.isEmpty() || pass.isEmpty() || confirmPass.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "All fields are required.");
            } else if (!email.contains("@")) {
                JOptionPane.showMessageDialog(frame, "Invalid email address.");
            } else if (!pass.equals(confirmPass)) {
                JOptionPane.showMessageDialog(frame, "Passwords do not match.");
            } else {
                JOptionPane.showMessageDialog(frame, "Registration successful!");
            }
        });

        frame.setSize(500, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}