package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	//OfficeWorker officeworker = new OfficeWorker();
     //   Trader trader = new Trader();
//        allWorkers.add(new ManualWorker());
//        System.out.println(allWorkers.toString());
        Workers workers = new Workers();

        ArrayList<String> arr = new ArrayList<String>();
        arr.add("officeWorker");
        arr.add("manualWorker");
        arr.add("trader");

        workers.addDifferentTypeOfWorkers(arr);

        for(int num=0; num<workers.allWorkers.size(); num++){
            System.out.println(workers.allWorkers.get(num).getExperience());
        }

        workers.sortWorkersByExperience();

        for(int num=0; num<workers.allWorkers.size(); num++){
            System.out.println(workers.allWorkers.get(num).getExperience());
        }


    }
}
