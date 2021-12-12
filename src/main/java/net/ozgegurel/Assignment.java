package net.ozgegurel;

import java.math.BigDecimal;
import java.util.HashMap;

import net.ozgegurel.department.EmployeeDepartment;
import net.ozgegurel.promote.FixPenaltyStrategy;
import net.ozgegurel.promote.FixPromoteStrategy;
import net.ozgegurel.promote.PercentagePenaltyStrategy;
import net.ozgegurel.promote.PercentagePromoteStrategy;

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

        ozge.updatePromotion(new PercentagePromoteStrategy(new BigDecimal(20)));
        System.out.println("Employee has changed promote strategy: "+ ozge.toString());

        ozge.applyPromotion();
        System.out.println("Employee has promoted as "+ ozge.toString());

        ozge.updatePromotion(new PercentagePenaltyStrategy(new BigDecimal(10)));
        ozge.applyPromotion();
        System.out.println("Salary reduction was made for this employee: "+ ozge.toString());

        ozge.updatePromotion(new FixPenaltyStrategy(new BigDecimal(100)));
        System.out.println("Employee has changed promote strategy: "+ ozge.toString());
        ozge.applyPromotion();
        System.out.println("Salary reduction was made for this employee: "+ ozge.toString());

        System.out.println("Employee list: \n " + employees);

    }   
}