package src;

import java.time.LocalDate;

import src.employees.Employee;

public class Comissions extends Salary {
    public Comissions(Company company, Employee employee, Salary salary, int schedule) {
        super(company, employee, salary, schedule);
        //TODO Auto-generated constructor stub
    }
    private Double percentOfSales;
    private LocalDate dateOfSale;
    private Double priceOfSale;
    private Double comission;
    public Double getPercentOfSales() {
        return percentOfSales;
    }
    public Double getComission() {
        return comission;
    }
    public void setComission(Double comission) {
        this.comission = comission;
    }
    public Double getPriceOfSale() {
        return priceOfSale;
    }
    public void setPriceOfSale(Double priceOfSale) {
        this.priceOfSale = priceOfSale;
    }
    public LocalDate getDateOfSale() {
        return dateOfSale;
    }
    public void setDateOfSale(LocalDate dateOfSale) {
        this.dateOfSale = dateOfSale;
    }
    public void setPercentOfSales(Double percentOfSales) {
        this.percentOfSales = percentOfSales;
    }
}
