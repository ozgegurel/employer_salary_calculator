package net.ozgegurel;

import java.math.BigDecimal;

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