class Manager extends Employee 
{                                                                         //inheritance

    public Manager(int empId, String name, double basicSalary)            //constructor
    {        
        super(empId, name, basicSalary);                                  //super calss parent class constructor
    }

    @Override
    public double calculateSalary()
    {                                                                     //polymorphism 
        return basicSalary + 5000; 
    }
}
