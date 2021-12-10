package net.ozgegurel;

public class EmployeeFactory {

    public static Employee create(
            String name,
            Float salary,
            EmployeeDepartment department,
            PromoteStrategy strategy) {
        
        Employee employee = null; 
        switch (department) {
            case TECHNOLOGY: 
                employee = new Technologist();
                break;
            case HUMANPARTNER: 
                employee = new Technologist(); //TODO: add HumanPartner() and others
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
