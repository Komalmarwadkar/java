import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentRegistrationForm extends JFrame {
    public StudentRegistrationForm() {
        setLayout(new GridLayout(5, 2)); setSize(300, 200);
        final JTextField txtName = new JTextField(), txtAge = new JTextField(); // Removed email field
        JComboBox cbCourse = new JComboBox(new String[]{"CS", "EE", "ME", "CE"});
        JRadioButton rbMale = new JRadioButton("Male"), rbFemale = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup(); genderGroup.add(rbMale); genderGroup.add(rbFemale);
        add(new JLabel("Name:")); add(txtName); add(new JLabel("Age:")); add(txtAge);
        add(new JLabel("Gender:"));
        JPanel genderPanel = new JPanel(); genderPanel.add(rbMale); genderPanel.add(rbFemale);
        add(genderPanel);
        add(new JLabel("Course:")); add(cbCourse);

        JButton btnSubmit = new JButton("Submit");
        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Name: " + txtName.getText() + "\nAge: " + txtAge.getText());
            }
        });
        add(btnSubmit);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); setVisible(true);
    }

    public static void main(String[] args) {
        new StudentRegistrationForm();
    }
}
