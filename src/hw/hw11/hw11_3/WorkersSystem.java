package hw.hw11.hw11_3;

import java.util.Arrays;
import java.util.Objects;

public class WorkersSystem {
    Worker[] workers;

    public WorkersSystem(){
        workers = new Worker[0];
    }
    public void addWorker(String name, String profession, int salary, String department) {
        workers = Arrays.copyOf(workers, workers.length + 1);
        workers[workers.length - 1] = new Worker(name, profession, salary, department);
    }
    public void removeWorker(String name, String profession, String department) {
        int index = 0;
        Worker[] removeWorkers = new Worker[workers.length - 1];
        for (int i = 0; i < workers.length; i++) {
            if (!(Objects.equals(workers[i].getName(), name) && Objects.equals(workers[i].getProfession(), profession) && Objects.equals(workers[i].getDepartment(), department))) {
                removeWorkers[index] = workers[i];
                System.out.println("Работник удален: " + name);
                index++;
            }
        }
        workers = removeWorkers;
    }
    public void countSalary(){
        int salary = 0;
        for (int i = 0; i < workers.length; i++) {
            if (workers[i]!=null)
                salary+=workers[i].getSalary();
        }
        System.out.println("Загальна зарплата працівників становить "+salary);
    }
    public static void avgSalary(WorkersSystem system){
        int salary = 0;
        Worker[] workers = system.workers;
        for (int i = 0; i < workers.length; i++) {
            salary+=workers[i].getSalary();
        }
        System.out.println("Загальна зарплата працівників становить"+salary/ workers.length);
    }
}