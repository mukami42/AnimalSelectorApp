import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AnimalSelector extends JFrame implements ActionListener {
    private JLabel imageLabel;
    private JRadioButton birdButton, catButton, dogButton, rabbitButton, pigButton;

    public AnimalSelector() {
        setTitle("Animal Selector");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create radio buttons
        birdButton = new JRadioButton("Bird");
        catButton = new JRadioButton("Cat");
        dogButton = new JRadioButton("Dog");
        rabbitButton = new JRadioButton("Rabbit");
        pigButton = new JRadioButton("Pig");

        // Create a button group
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(birdButton);
        buttonGroup.add(catButton);
        buttonGroup.add(dogButton);
        buttonGroup.add(rabbitButton);
        buttonGroup.add(pigButton);

        // Add action listener to the radio buttons
        birdButton.addActionListener(this);
        catButton.addActionListener(this);
        dogButton.addActionListener(this);
        rabbitButton.addActionListener(this);
        pigButton.addActionListener(this);

        // Create a panel for the radio buttons
        JPanel radioPanel = new JPanel(new GridLayout(5, 1));
        radioPanel.add(birdButton);
        radioPanel.add(catButton);
        radioPanel.add(dogButton);
        radioPanel.add(rabbitButton);
        radioPanel.add(pigButton);
        add(radioPanel, BorderLayout.WEST);

        // Create a label for the image
        imageLabel = new JLabel();
        add(imageLabel, BorderLayout.CENTER);

        // Set frame size and position
        setSize(400, 300);
        setLocationRelativeTo(null); // Center the frame on the screen
        setVisible(true);
    }

    // Handle radio button clicks
    public void actionPerformed(ActionEvent e) {
        String imageName = "";
        if (e.getSource() == birdButton) {
            imageName = "images/bird.jpg";
        } else if (e.getSource() == catButton) {
            imageName = "images/cat.jpg";
        } else if (e.getSource() == dogButton) {
            imageName = "images/dog.jpg";
        } else if (e.getSource() == rabbitButton) {
            imageName = "images/rabbit.jpg";
        } else if (e.getSource() == pigButton) {
            imageName = "images/pig.jpg";
        }
        ImageIcon icon = new ImageIcon(imageName);
        imageLabel.setIcon(icon);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new AnimalSelector();
        });
    }
}
