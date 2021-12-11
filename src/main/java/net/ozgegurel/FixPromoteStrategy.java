package net.ozgegurel;

public class FixPromoteStrategy implements PromoteStrategy {
    Float fixAmount = 0.0f;
    
    public FixPromoteStrategy(float fixAmount){
        this.fixAmount = fixAmount;
    }

    @Override
    public Employee apply(Employee employee) {
        employee.salary += fixAmount;
        return employee;
    }
}