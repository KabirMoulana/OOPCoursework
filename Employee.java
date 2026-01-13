class Employee {                                               //parent class

   //attributes
    protected int empId;
    protected String name;                                     //encapsulation
    protected double basicSalary;

    public Employee(int empId, String name, double basicSalary) {        //constructor
        this.empId = empId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public double calculateSalary() {                             //method
        return basicSalary;
    }
}
