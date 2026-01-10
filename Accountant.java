public class Accountant extends Employee {                                       //inheritance

    public Accountant(int empId, String name, double basicSalary) {              //constructor
        super(empId, name, basicSalary);
    }

    @Override 
    public double calculateSalary() {                                            //polymorphism
        return basicSalary + 4000;
    }
}
