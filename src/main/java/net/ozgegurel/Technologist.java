package net.ozgegurel;

import java.math.BigDecimal;

public class Technologist extends Employee{

    public Technologist(String name, BigDecimal salary, PromoteStrategy strategy){
        super(name, salary, strategy);
    }

    public Technologist(){
        super("", new BigDecimal(0), null);
    }

}
