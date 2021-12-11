package net.ozgegurel;


public class GrowthManager extends Employee{

    public GrowthManager(String name, Float salary, PromoteStrategy strategy){
        super(name, salary, strategy);
    }

    public GrowthManager(){
        super("", 0.0f, null);
    }

}