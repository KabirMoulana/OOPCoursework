public class Employee {                                                       //parent class

    protected int empId;
    protected String name;                                                     //attributes 
    protected double basicSalary;                                              //encapsulation has been used, protected

    public Employee(int empId, String name, double basicSalary) {              //constructor
        this.empId = empId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public double calculateSalary() {          
        return basicSalary;
    }
}
