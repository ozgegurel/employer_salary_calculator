package net.ozgegurel.promote;

import java.math.BigDecimal;

import net.ozgegurel.Employee;
import net.ozgegurel.PromoteStrategy;

public class FixPenaltyStrategy implements PromoteStrategy {
    BigDecimal fixAmount = new BigDecimal(0);

    public FixPenaltyStrategy(BigDecimal fixAmount){
        this.fixAmount = fixAmount;
    }

    @Override
    public Employee apply(Employee employee) {
        employee.salary = employee.salary.subtract(fixAmount);
        return employee;
    }
}