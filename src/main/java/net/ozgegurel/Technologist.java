package net.ozgegurel;

public class Technologist extends Employee{

    public Technologist(String name, Float salary, PromoteStrategy strategy){
        super(name, salary, strategy);
    }

    public Technologist(){
        super("", 0.0f, null);
    }

}
