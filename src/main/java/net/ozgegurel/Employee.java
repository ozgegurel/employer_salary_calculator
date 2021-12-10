package net.ozgegurel;


public class Employee {
    public String name;
    public Float salary;
    public PromoteStrategy strategy;
    
    public Employee(String name, Float salary, PromoteStrategy strategy){
        this.name = name;
        this.salary = salary;
        this.strategy = strategy;
    }

    public void applyPromotion() {
        strategy.apply(this);
    }

    public String toString(){
        return "name:" + this.name + " salary:"+ this.salary ;
    }
    
}
