package com.company;

public class ManualWorker extends Worker {
    private int physicalStrength;

    public ManualWorker(){
        super();
        this.physicalStrength = setPhysicalStrength();
    }

    public int getPhysicalStrength() {
        return physicalStrength;
    }

    public int setPhysicalStrength() {
        return concole.readInt("set physical level: ");
    }
}
