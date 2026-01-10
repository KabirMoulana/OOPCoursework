import javax.swing.*;
import java.awt.*;

public class EmployeeGUI extends JFrame {

    JTextField idField, nameField, salaryField;
    JComboBox<String> roleBox;
    JButton calculateButton;

    public EmployeeGUI() {

        setTitle("Employee Management System");
        setSize(400, 300);
        setLayout(new GridLayout(5, 2));

        // Light gray background
        getContentPane().setBackground(Color.LIGHT_GRAY);

        // Dark blue text color
        Color textColor = new Color(0, 51, 102);

        idField = new JTextField();
        nameField = new JTextField();
        salaryField = new JTextField();

        roleBox = new JComboBox<>(new String[]{
                "Manager", "Developer", "Accountant"
        });

        calculateButton = new JButton("Calculate Salary");

        // Button color changed to GREEN
        calculateButton.setBackground(Color.GREEN);
        calculateButton.setForeground(Color.BLACK);

        JLabel idLabel = new JLabel("Employee ID");
        JLabel nameLabel = new JLabel("Name");
        JLabel salaryLabel = new JLabel("Basic Salary");
        JLabel roleLabel = new JLabel("Role");

        idLabel.setForeground(textColor);
        nameLabel.setForeground(textColor);
        salaryLabel.setForeground(textColor);
        roleLabel.setForeground(textColor);

        idField.setForeground(textColor);
        nameField.setForeground(textColor);
        salaryField.setForeground(textColor);
        roleBox.setForeground(textColor);

        add(idLabel);
        add(idField);
        add(nameLabel);
        add(nameField);
        add(salaryLabel);
        add(salaryField);
        add(roleLabel);
        add(roleBox);
        add(calculateButton);

        calculateButton.addActionListener(e -> calculateSalary());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void calculateSalary() {

        int id = Integer.parseInt(idField.getText());
        String name = nameField.getText();
        double salary = Double.parseDouble(salaryField.getText());
        String role = roleBox.getSelectedItem().toString();

        Employee emp;

        if (role.equals("Manager")) {
            emp = new Manager(id, name, salary);
        } else if (role.equals("Developer")) {
            emp = new Developer(id, name, salary);
        } else {
            emp = new Accountant(id, name, salary);
        }

        double totalSalary = emp.calculateSalary();

        // Print user-entered data to command prompt
        System.out.println("------ Employee paysheet------");
        System.out.println("Employee ID  : " + id);
        System.out.println("Name        : " + name);
        System.out.println("Basic salary : " + salary);
        System.out.println("Role        : " + role);
        System.out.println("Total salary : " + totalSalary);
        System.out.println("------------------------------");

        JOptionPane.showMessageDialog(this,
                "Total Salary = " + totalSalary);
    }
}
