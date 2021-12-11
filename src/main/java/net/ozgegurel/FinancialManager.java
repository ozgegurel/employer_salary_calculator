package net.ozgegurel;


public class FinancialManager extends Employee{

    public FinancialManager(String name, Float salary, PromoteStrategy strategy){
        super(name, salary, strategy);
    }

    public FinancialManager(){
        super("", 0.0f, null);
    }

}