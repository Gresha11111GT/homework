package hw.hw9.hw9_2;

import hw.hw9.hw9_1.Book;

import java.util.Arrays;

public class StudentManager {
    Student[] students;
    Grade[] grades;

    public StudentManager(){
        students = new Student[0];
        grades = new Grade[0];
    }

    public void addStudents(String name, int id, int age) {
        students = Arrays.copyOf(students, students.length+1);
        students[students.length-1] = new Student(name, id, age);
    }
    public void addGrade(int studentId, String subject, double grade){
        Student student = getStudentById(studentId);
        if (student != null) {
            grades = Arrays.copyOf(grades, grades.length+1);
            grades[grades.length-1] = new Grade(student, subject, grade);
        } else {
            System.out.println("Student with id " + studentId + " not found.");
        }
    }

    public void getAvgGrade(int id) {
        Student student = getStudentById(id);
        double sumGrade = 0;
        double quantity = 0;
        if (student != null) {
            for (int i = 0; i < grades.length; i++) {
                if (grades[i].student == student) {
                    sumGrade += grades[i].grade;
                    quantity++;
                }
            }
            System.out.println("Average grade of '"+ student.name +"'"+sumGrade/quantity);
        }
        else {
            System.out.println("Student with id " + id + " not found.");
        }
    }
    public Student getStudentById(int id) {
        for (Student student : students) {
            if (student.id == id) {
                return student;
            }
        }
        return null;
    }
}
