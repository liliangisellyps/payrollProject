package src.payment;


import src.employees.Employee;

public class Salary extends Payroll{
    public Salary(Company company, Employee employee, Salary salary, int schedule) {
        super();
    }
    Double value;
    Double normalTaxes;
    Double extraHours;
    Comissions comissions;
}
