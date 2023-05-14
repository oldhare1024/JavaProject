import javax.swing.*;
import java.awt.*;

// Define a class named 'CourseSelectionSystemGUI'
class CourseSelectionSystemGUI {
    // Define a main method
    public static void main(String[] args) {
        // Create an instance of the 'JFrame' class and set its attributes
        JFrame frame = new JFrame("Course Selection System");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel called 'mainPanel'
        JPanel mainPanel = new JPanel();

        // Create and set layout manager for 'mainPanel'
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));

        // Create a Label named 'welcomeLabel' and add it to mainPanel
        JLabel welcomeLabel = new JLabel("Welcome to Course Selection System!");
        welcomeLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(welcomeLabel);

        // Create a Label named 'modulesLabel' and add it to mainPanel
        JLabel modulesLabel = new JLabel("The system is mainly composed of the following modules:");
        modulesLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(modulesLabel);

        // Create a list of strings containining the different modules
        String[] modules = {"Login", "Course Selection", "Course Information Inquiry", "Grade Inquiry",
                "Course Selection Suggestion", "Information Modification", "Print Functionality"};

        // Create a JList named 'moduleList' and add it to mainPanel
        JList<String> moduleList = new JList<>(modules);
        moduleList.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(moduleList);

        // Create a JButton called 'loginButton' and add it to mainPanel
        JButton loginButton = new JButton("Login");
        loginButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(loginButton);

        //Create and add other buttons according to the different modules

        // Add mainPanel to frame, set it visible
        frame.add(mainPanel);
        frame.setVisible(true);
    }
}