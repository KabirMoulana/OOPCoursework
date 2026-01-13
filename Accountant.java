class Accountant extends Employee                                               //inheritance
{                                            

    public Accountant(int empId, String name, double basicSalary)              //constructor
    {
        super(empId, name, basicSalary);                                       //super calls the parent class constructor
    }

    @Override
    public double calculateSalary()                                            //polymorphism (method over-riding)
    {
        return basicSalary + 4000;
    }
}
