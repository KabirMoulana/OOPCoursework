public class Manager extends Employee {                                //inheritance

    public Manager(int empId, String name, double basicSalary) {       //constructor
        super(empId, name, basicSalary);                               //super calls parentclass constructor
    }

    @Override
    public double calculateSalary() {
        return basicSalary + 5000;
    }
}
