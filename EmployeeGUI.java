import javax.swing.*;
import java.awt.*;

class EmployeeGUI {
        public void open() {

        JFrame f = new JFrame("Employee Management System");
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new GridLayout(5, 2));

        Font labelFont = new Font("Arial", Font.BOLD, 16);         //font
        Font fieldFont = new Font("Arial", Font.PLAIN, 15);
        Font buttonFont = new Font("Arial", Font.BOLD, 16);

        Color bgColor = Color.LIGHT_GRAY;            // backgrnd
        Color textColor = new Color(0, 51, 102);     // dark blue

        f.getContentPane().setBackground(bgColor);

        JLabel idLabel = new JLabel("Employee ID");           //label
        JLabel nameLabel = new JLabel("Name");
        JLabel salaryLabel = new JLabel("Basic Salary");
        JLabel roleLabel = new JLabel("Role");

        idLabel.setFont(labelFont);
        nameLabel.setFont(labelFont);
        salaryLabel.setFont(labelFont);
        roleLabel.setFont(labelFont);

        idLabel.setForeground(textColor);
        nameLabel.setForeground(textColor);
        salaryLabel.setForeground(textColor);
        roleLabel.setForeground(textColor);

        JTextField idField = new JTextField();
        JTextField nameField = new JTextField();            //takes inputs
        JTextField salaryField = new JTextField();

        idField.setFont(fieldFont);
        nameField.setFont(fieldFont);
        salaryField.setFont(fieldFont);

        idField.setForeground(textColor);
        nameField.setForeground(textColor);
        salaryField.setForeground(textColor);

        idField.setBackground(Color.WHITE);
        nameField.setBackground(Color.WHITE);
        salaryField.setBackground(Color.WHITE);

        JComboBox<String> roleBox = new JComboBox<>(                 //selection box
                new String[]{"Manager", "Developer", "Accountant"});
        roleBox.setFont(fieldFont);
        roleBox.setForeground(textColor);
        roleBox.setBackground(Color.WHITE);

        JButton calculateButton = new JButton("Calculate Salary");       //button
        calculateButton.setFont(buttonFont);
        // Button color changed to GREEN and text color to DARK BLUE
        calculateButton.setBackground(Color.GREEN);
        calculateButton.setForeground(textColor);

        calculateButton.addActionListener(e -> {       //action button

            int id = Integer.parseInt(idField.getText());     //gets id
            String name = nameField.getText();                 //gets text from name field
            double basicSalary = Double.parseDouble(salaryField.getText());    //gets salary
            String role = roleBox.getSelectedItem().toString();

            Employee emp;
            if (role.equals("Manager")) {
                emp = new Manager(id, name, basicSalary);
            } else if (role.equals("Developer")) {
                emp = new Developer(id, name, basicSalary);
            } else {
                emp = new Accountant(id, name, basicSalary);
            }

            double totalSalary = emp.calculateSalary();

            System.out.println("------ Employee payslip ------");     //output
            System.out.println("ID            : " + id);
            System.out.println("Name          : " + name);
            System.out.println("Basic Salary  : " + basicSalary);
            System.out.println("Role          : " + role);
            System.out.println("Total Salary  : " + totalSalary);
            System.out.println("      ------------------       ");

            JOptionPane.showMessageDialog
              (f,  "Total Salary = " + totalSalary);
        });
        f.add(idLabel);
        f.add(idField);
        f.add(nameLabel);          //add components
        f.add(nameField);
        f.add(salaryLabel);
        f.add(salaryField);
        f.add(roleLabel);
        f.add(roleBox);
        f.add(calculateButton);

        f.setVisible(true);      //makes the frame visible on screen
    }
}
