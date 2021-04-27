package src.employees;

import java.util.ArrayList;
import java.util.List;

import src.payment.Payment;

public class Commissioned extends Employee{
    private int salary;
    private int commission;
    private List<SaleReport> salesReport;
  
    public Commissioned(String name, int id, String address, UnionMember unionMember, Payment payment, int employeeType,
            int salary, int commission) {
        super(name, id, address, unionMember, payment, employeeType);
        this.salary = salary;
        this.commission = commission;
        this.salesReport = new ArrayList<SaleReport>();

    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getComission() {
        return commission;
    }
    public void setComission(int commission) {
        this.commission = commission;
    }
    public List<SaleReport> getSalesReport() {
        return salesReport;
    }
    public void setSalesReport(List<SaleReport> salesReport) {
        this.salesReport = salesReport;
    }
    
}
