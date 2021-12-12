package net.ozgegurel.department;

import java.math.BigDecimal;

import net.ozgegurel.Employee;
import net.ozgegurel.PromoteStrategy;

public class FinancialManager extends Employee{

    public FinancialManager(String name, BigDecimal salary, PromoteStrategy strategy){
        super(name, salary, strategy);
    }

    public FinancialManager(){
        super("", new BigDecimal(0), null);
    }

}