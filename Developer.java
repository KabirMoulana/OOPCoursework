class Developer extends Employee
{                                                                           //inheritance

    public Developer(int empId, String name, double basicSalary)             //constructor
    {                                                                        
        super(empId, name, basicSalary);                                     //super calls the parent class consrtuctor
    }

    @Override
    public double calculateSalary() 
    {                                                                         //polymorphism 
        return basicSalary + 3000;
    }
}
