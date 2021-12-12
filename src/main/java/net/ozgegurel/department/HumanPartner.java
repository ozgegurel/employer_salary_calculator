package net.ozgegurel.department;

import java.math.BigDecimal;

import net.ozgegurel.Employee;
import net.ozgegurel.PromoteStrategy;

public class HumanPartner extends Employee{

    public HumanPartner(String name, BigDecimal salary, PromoteStrategy strategy){
        super(name, salary, strategy);
    }

    public HumanPartner(){
        super("", new BigDecimal(0), null);
    }

}