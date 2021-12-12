package net.ozgegurel;

import java.math.BigDecimal;

public class HumanPartner extends Employee{

    public HumanPartner(String name, BigDecimal salary, PromoteStrategy strategy){
        super(name, salary, strategy);
    }

    public HumanPartner(){
        super("", new BigDecimal(0), null);
    }

}