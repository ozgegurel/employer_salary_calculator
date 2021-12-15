package net.ozgegurel;

import java.math.BigDecimal;
import java.util.HashMap;

import net.ozgegurel.department.EmployeeDepartment;
import net.ozgegurel.promote.FixPromoteStrategy;

public class Assignment {
    public static void main(String[] args) {
        HashMap employees = new HashMap<String,Float>();
        
        Employee ozge = EmployeeFactory.create(
            "Özge Gürel", 
            new BigDecimal(100), 
            EmployeeDepartment.TECHNOLOGY, 
            new FixPromoteStrategy(new BigDecimal(100))
        );
        System.out.println("Employee is created as "+ ozge.toString());

        employees.put(ozge.name, ozge);
        System.out.println("Employee is added the list " + employees);

        System.out.println("Özge Gürel Design Pattern Assignment");
    }   
}