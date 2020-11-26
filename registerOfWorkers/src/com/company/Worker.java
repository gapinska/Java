package com.company;

import java.util.UUID;

public abstract class Worker {
    private String name;
    private String surname;
    private int age;
    private int experience;
    private String street;
    private int houseNum;
    private int num;
    private String city;
    private final int ID = id++;
    static int id = 1;

    Concole concole = new Concole();




    Worker() {
        this.name = setName();
        this.surname = setSurname();
        this.age = setAge();
        this.experience = setExperience();
        this.street = setStreet();
        this.houseNum = setHouseNum();
        this.num = setNum();
        this.city = setCity();
    }

    public String getName() {
        return name;
    }

    public String setName() {
        return concole.readData("set name: ");
    }

    public String getSurname() {
        return surname;
    }

    public String setSurname() {
        return concole.readData("set surname: ");
    }

    public int getAge() {
        return age;
    }

    public int setAge() {
        return concole.readInt("set age: ");
    }

    public int getExperience() {
        return experience;
    }

    public int setExperience() {
        return concole.readInt("set experience: ");
    }

    public String getStreet() {
        return street;
    }

    public String setStreet() {
        return concole.readData("set street: ");
    }

    public int getHouseNum() {
        return houseNum;
    }

    public int setHouseNum() {
        return concole.readInt("set number of house: ");
    }

    public int getNum() {
        return num;
    }

    public int setNum() {
        return concole.readInt("set number of local: ");
    }

    public String getCity() {
        return city;
    }

    public String setCity() {
        return concole.readData("set city: ");
    }

    public int getId() {
        return ID;
    }
}
