package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Workers implements IRegister{
    ArrayList<Worker> allWorkers = new ArrayList();
    Concole concole = new Concole();

    @Override
    public void addWorker(String worker) {
        switch (worker) {
            case "officeWorker":
                allWorkers.add(new OfficeWorker());
                break;

            case "manualWorker":
                allWorkers.add(new ManualWorker());
                break;

            case "trader":
                allWorkers.add(new Trader());
                break;

            default: {
                System.out.println("put correct type of worker: officeWorker, trader or manualWorker");
            }
        }
    }

    @Override
    public void removeWorker(int id) {
        for(int num=0; num<allWorkers.size();num++){
            if(allWorkers.get(num).getId()==id) {
                allWorkers.remove(allWorkers.get(num));
            }
        }
    }

    @Override
    public void addDifferentTypeOfWorkers(ArrayList<String> workersToAdd) {
        for (String worker: workersToAdd) {
            addWorker(worker);
        }
    }

    @Override
    public void sortWorkersByExperience() {
        Collections.sort(allWorkers, new Comparator<Worker>() {
            @Override
            public int compare(Worker o1, Worker o2) {
                return o1.getExperience()- o2.getExperience();
            }
        });

    }

    @Override
    public void sortWorkersByAge() {

    }

    @Override
    public void sortWorkersBySurname() {

    }

    @Override
    public void findWorkersByCity() {

    }

    @Override
    public void sortWorkersByValue() {

    }
}
