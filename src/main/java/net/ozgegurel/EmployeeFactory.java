package net.ozgegurel;

import java.math.BigDecimal;

import net.ozgegurel.department.EmployeeDepartment;
import net.ozgegurel.department.FinancialManager;
import net.ozgegurel.department.GrowthManager;
import net.ozgegurel.department.HumanPartner;
import net.ozgegurel.department.Technologist;

public class EmployeeFactory {

    public static Employee create(
            String name,
            BigDecimal salary,
            EmployeeDepartment department,
            PromoteStrategy strategy) {
        
        Employee employee = null; 
        switch (department) {
            case TECHNOLOGY: 
                employee = new Technologist();
                break;
            case HUMANPARTNER: 
                employee = new HumanPartner();
                break;
            case FINANCE: 
                employee = new FinancialManager();
                break;
            case GROWTH: 
                employee = new GrowthManager();
                break;
            default:
                throw new IllegalArgumentException();
        }
        employee.strategy = strategy;
        employee.name = name;
        employee.salary = salary;
        return employee;
    }

}
