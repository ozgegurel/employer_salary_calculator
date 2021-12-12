package net.ozgegurel;

import java.math.BigDecimal;

public class FinancialManager extends Employee{

    public FinancialManager(String name, BigDecimal salary, PromoteStrategy strategy){
        super(name, salary, strategy);
    }

    public FinancialManager(){
        super("", new BigDecimal(0), null);
    }

}