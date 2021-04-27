package src;

import src.employees.Employee;

import java.util.ArrayList;
import java.util.List;

public class Payroll {
    Company company;
    Employee employee;
    Salary salary;
    public List<String> schedule;
    
    public Payroll() {
        this.schedule = new ArrayList<String>();
    }
    public Payroll(Company company, Employee employee, Salary salary, String schedule) {
        this.company = company;
        this.employee = employee;
        this.salary = salary;
    }
    public List<String> getSchedule() {
        return schedule;
    }
    public void setSchedule(List<String> sch) {
        this.schedule = sch;
    }
}
