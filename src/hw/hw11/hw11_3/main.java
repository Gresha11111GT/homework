package hw.hw11.hw11_3;
public class main {
    public static void main(String[] args) {
        WorkersSystem workersSystem = new WorkersSystem();
        workersSystem.addWorker("Gresha", "Manager", 2000, "IT");
        workersSystem.addWorker("Posya", "Programmer", 3500, "IT");
        workersSystem.addWorker("Slalav", "Cleaner", 700, "IT");
        workersSystem.countSalary();
        workersSystem.removeWorker("Gresha", "Manager", "IT");
        workersSystem.countSalary();
        WorkersSystem.avgSalary(workersSystem);
    }
}