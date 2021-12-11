package net.ozgegurel;

import java.util.HashMap;

public class Assignment {
    public static void main(String[] args) {
        HashMap employees = new HashMap<String,Float>();
        
        Employee ozge = EmployeeFactory.create("Özge Gürel", 100f, EmployeeDepartment.TECHNOLOGY, new FixPromoteStrategy(100f));
        System.out.println("Employee is created as "+ ozge.toString());

        employees.put(ozge.name, ozge.salary);
        System.out.println("Employee is added the list " + employees);

        ozge.applyPromotion();
        System.out.println("Employee has promoted as "+ ozge.toString());
            

    }   
}