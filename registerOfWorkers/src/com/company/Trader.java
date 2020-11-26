package com.company;

public class Trader extends Worker {
    private int provision;
    private String efficiency;

    public Trader (){
        super();
        this.provision = setProvision();
        this.efficiency = setEfficiency();
    }

    private String setEfficiency() {
        return concole.readData("set efficiency (low, medium or high): ");
    }

    public int getProvision() {
        return provision;
    }
    public int setProvision(){
        return concole.readInt("set provision: ");
    }


}
