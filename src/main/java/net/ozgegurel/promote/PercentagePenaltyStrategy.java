package net.ozgegurel.promote;

import java.math.BigDecimal;

import net.ozgegurel.Employee;
import net.ozgegurel.PromoteStrategy;

public class PercentagePenaltyStrategy implements PromoteStrategy{
    BigDecimal percentAmount = new BigDecimal(0);
    
    public PercentagePenaltyStrategy(BigDecimal percentAmount){
        this.percentAmount = percentAmount;

    }

    @Override
    public Employee apply(Employee employee) {
        BigDecimal hundred = new BigDecimal(100);
        BigDecimal multipleNumber = hundred.subtract(percentAmount).divide(hundred);
        employee.salary = employee.salary.multiply(multipleNumber);
        return employee;
    }
}