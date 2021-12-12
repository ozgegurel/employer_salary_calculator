package net.ozgegurel;

import java.math.BigDecimal;

public class GrowthManager extends Employee{

    public GrowthManager(String name, BigDecimal salary, PromoteStrategy strategy){
        super(name, salary, strategy);
    }

    public GrowthManager(){
        super("", new BigDecimal(0), null);
    }

}