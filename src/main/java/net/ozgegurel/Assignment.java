package net.ozgegurel;

import java.util.HashMap;

public class Assignment {
    public static void main(String[] args) {
        HashMap employees = new HashMap<String,Float>();
        System.out.println("Hello world!");
        Employee ozge = EmployeeFactory.create("Özge Gürel", 100f, EmployeeDepartment.TECHNOLOGY, new FixPromoteStrategy(100f));
        System.out.println(ozge.toString());
        ozge.applyPromotion();
        System.out.println(ozge.toString());
            
        employees.put(ozge.name, ozge.salary);
        System.out.println(employees);

    }
    
}




