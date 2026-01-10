public class Developer extends Employee {                                 //inheritance

    public Developer(int empId, String name, double basicSalary) {        //constructor
        super(empId, name, basicSalary);                                 //super calls the parent class constructor
    }

    @Override                                                            //polymorphism
    public double calculateSalary() {
        return basicSalary + 3000;
    }
}
