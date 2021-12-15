package net.ozgegurel;

import java.math.BigDecimal;

public class Employee {
    public String name;
    public BigDecimal salary;
    public PromoteStrategy strategy;
    
    public Employee(String name, BigDecimal salary, PromoteStrategy strategy){
        this.name = name;
        this.salary = salary;
        this.strategy = strategy;
    }

    public void applyPromotion() {
        strategy.apply(this);
    }

    public void updatePromotion(PromoteStrategy strategy){
        this.strategy = strategy;
    }

    public String toString(){
        return "name:" + this.name + " salary:"+ this.salary ;
    }
    
}
