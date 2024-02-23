package hw.hw11.hw11_3;

public class Worker {
    private String profession;

    private String name;

    private int salary;

    private String department;

    public Worker(String profession, String name, int salary, String department) {
        this.profession = profession;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
