package com.company;

import java.util.ArrayList;

public interface IRegister {
    void addWorker(String worker);
    void removeWorker(int id);
    void addDifferentTypeOfWorkers(ArrayList<String> workersToAdd);
    void sortWorkersByExperience();
    void sortWorkersByAge();
    void sortWorkersBySurname();
    void findWorkersByCity();
    void sortWorkersByValue();
}
