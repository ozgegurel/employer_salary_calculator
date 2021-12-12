package net.ozgegurel;

import java.math.BigDecimal;
import java.util.HashMap;

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

        ozge.applyPromotion();
        ozge.applyPromotion();
        ozge.applyPromotion();
        
        System.out.println("Employee has promoted as "+ ozge.toString());

        ozge.changePromotion(new PercentagePromoteStrategy(new BigDecimal(20)));
        System.out.println("Employee has changed promote strategy: "+ ozge.toString());

        ozge.applyPromotion();
        System.out.println("Employee has promoted as "+ ozge.toString());

        System.out.println("Employee list: \n " + employees);



    }   
}