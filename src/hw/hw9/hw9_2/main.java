package hw.hw9.hw9_2;

public class main {
    public static void main(String[] args) {
        StudentManager student = new StudentManager();
        student.addStudents("Artem", 0, 13);
        student.addStudents("Anton", 1, 16);
        student.addStudents("Vanya", 2, 10);
        student.addGrade(0, "Math", 10);
        student.addGrade(0, "IT", 12);
        student.addGrade(0, "PE", 5);
        student.addGrade(0, "Art", 10);
        student.addGrade(0, "PE", 5);
        student.addGrade(1, "Art", 4);
        student.addGrade(1, "IT", 10);
        student.addGrade(1, "PE", 11);
        student.addGrade(2, "Art", 11);
        student.addGrade(2, "IT", 7);
        student.addGrade(2, "PE", 10);
        student.getAvgGrade(0);
        student.getAvgGrade(1);
        student.getAvgGrade(2);
    }
}
