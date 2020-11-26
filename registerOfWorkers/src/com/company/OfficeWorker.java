package com.company;

import java.util.UUID;

public class OfficeWorker extends Worker {
    private int intelectLevel;
    private final int OFFICEWORKERID = id++;
    static int id = 1;

    public OfficeWorker() {
      super();
      this.intelectLevel = setIntelectLevel();
    }

    public int getIntelectLevel() {
        return intelectLevel;
    }
    public int setIntelectLevel() {
        return concole.readInt("set intelect level: ");
    }
    public int getOFFICEWORKERID() {
        return OFFICEWORKERID;
    }
}
