package net.ozgegurel.promote;

import java.math.BigDecimal;

import net.ozgegurel.Employee;
import net.ozgegurel.PromoteStrategy;

public class FixPromoteStrategy implements PromoteStrategy {
    BigDecimal fixAmount = new BigDecimal(0);

    public FixPromoteStrategy(BigDecimal fixAmount){
        this.fixAmount = fixAmount;
    }

    @Override
    public Employee apply(Employee employee) {
        employee.salary = employee.salary.add(fixAmount);
        return employee;
    }
}