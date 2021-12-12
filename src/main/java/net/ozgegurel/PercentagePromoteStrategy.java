package net.ozgegurel;

import java.math.BigDecimal;

public class PercentagePromoteStrategy implements PromoteStrategy{
    BigDecimal percentAmount = new BigDecimal(0);
    
    public PercentagePromoteStrategy(BigDecimal percentAmount){
        this.percentAmount = percentAmount;

    }

    @Override
    public Employee apply(Employee employee) {
        BigDecimal hundred = new BigDecimal(100);
        BigDecimal multipleNumber = percentAmount.add(hundred).divide(hundred);
        employee.salary = employee.salary.multiply(multipleNumber);
        return employee;
    }
}