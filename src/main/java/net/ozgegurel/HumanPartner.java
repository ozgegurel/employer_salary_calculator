package net.ozgegurel;


public class HumanPartner extends Employee{

    public HumanPartner(String name, Float salary, PromoteStrategy strategy){
        super(name, salary, strategy);
    }

    public HumanPartner(){
        super("", 0.0f, null);
    }

}