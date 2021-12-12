package net.ozgegurel.department;

import java.math.BigDecimal;

import net.ozgegurel.Employee;
import net.ozgegurel.PromoteStrategy;

public class Technologist extends Employee{

    public Technologist(String name, BigDecimal salary, PromoteStrategy strategy){
        super(name, salary, strategy);
    }

    public Technologist(){
        super("", new BigDecimal(0), null);
    }

}
