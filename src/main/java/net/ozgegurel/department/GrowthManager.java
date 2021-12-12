package net.ozgegurel.department;

import java.math.BigDecimal;

import net.ozgegurel.Employee;
import net.ozgegurel.PromoteStrategy;

public class GrowthManager extends Employee{

    public GrowthManager(String name, BigDecimal salary, PromoteStrategy strategy){
        super(name, salary, strategy);
    }

    public GrowthManager(){
        super("", new BigDecimal(0), null);
    }

}