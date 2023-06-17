import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class OnlineReservationSystem1 extends JFrame implements ActionListener {
    private JTextField loginIdField, passwordField, trainNumberField, trainNameField, classTypeField, dateOfJourneyField,
            sourceField, destinationField, pnrNumberField;
    private JButton loginButton, reservationButton, cancellationButton;

    public OnlineReservationSystem1() {
        setTitle("Online Reservation System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2));

        // Login Form
        JLabel loginIdLabel = new JLabel("Login ID:");
        loginIdField = new JTextField();
        panel.add(loginIdLabel);
        panel.add(loginIdField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JTextField();
        panel.add(passwordLabel);
        panel.add(passwordField);

        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        panel.add(loginButton);

        // Reservation System
        JLabel trainNumberLabel = new JLabel("Train Number:");
        trainNumberField = new JTextField();
        panel.add(trainNumberLabel);
        panel.add(trainNumberField);

        JLabel trainNameLabel = new JLabel("Train Name:");
        trainNameField = new JTextField();
        panel.add(trainNameLabel);
        panel.add(trainNameField);

        JLabel classTypeLabel = new JLabel("Class Type:");
        classTypeField = new JTextField();
        panel.add(classTypeLabel);
        panel.add(classTypeField);

        JLabel dateOfJourneyLabel = new JLabel("Date of Journey:");
        dateOfJourneyField = new JTextField();
        panel.add(dateOfJourneyLabel);
        panel.add(dateOfJourneyField);

        JLabel sourceLabel = new JLabel("Source:");
        sourceField = new JTextField();
        panel.add(sourceLabel);
        panel.add(sourceField);

        JLabel destinationLabel = new JLabel("Destination:");
        destinationField = new JTextField();
        panel.add(destinationLabel);
        panel.add(destinationField);

        reservationButton = new JButton("Reserve");
        reservationButton.addActionListener(this);
        panel.add(reservationButton);

        
        JLabel pnrNumberLabel = new JLabel("PNR Number:");
        pnrNumberField = new JTextField();
        panel.add(pnrNumberLabel);
        panel.add(pnrNumberField);

        cancellationButton = new JButton("Cancel Reservation");
        cancellationButton.addActionListener(this);
        panel.add(cancellationButton);

        add(panel);
        setVisible(true);
    }

    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            
            if (authenticateUser(loginIdField.getText(), passwordField.getText())) {
                JOptionPane.showMessageDialog(this, "Login successful!");

            
                loginButton.setEnabled(false);
                loginIdField.setEnabled(false);
                passwordField.setEnabled(false);
                reservationButton.setEnabled(true);
                cancellationButton.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(this, "Invalid login credentials. Please try again.");
            }
        } else if (e.getSource() == reservationButton) {
    
            String trainNumber = trainNumberField.getText();
            String trainName = trainNameField.getText();
            String classType = classTypeField.getText();
            String dateOfJourney = dateOfJourneyField.getText();
            String source = sourceField.getText();
            String destination = destinationField.getText();

           
            JOptionPane.showMessageDialog(this, "Reservation Successful!");
        } else if (e.getSource() == cancellationButton) {
            
            String pnrNumber = pnrNumberField.getText();

            
            JOptionPane.showMessageDialog(this, "Reservation with PNR number " + pnrNumber + " has been canceled.");
        }
    }


    private boolean authenticateUser(String loginId, String password) {
        
        return true; 
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new OnlineReservationSystem1());
    }
}
