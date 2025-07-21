package ClassRelationships.Association;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;


//Bidirectional Association: Here both classes know each other

class Student {
    private final String name;
    private final List<Subject> subjects = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void enroll(Subject subject) {
        subjects.add(subject);
        subject.addStudent(this);
    }

    public String getName() {
        return name;
    }

    public void showCourses() {
        out.println("Student:: " + this.name);
        for (Subject subject : subjects) {
            out.println(subject.getName());
        }
    }
}

class Subject {
    private final String subject;
    private final List<Student> students = new ArrayList<>();

    public Subject(String subject) {
        this.subject = subject;
    }

    public String getName() {
        return subject;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void showStudents() {
        out.println("Subject: " + this.subject);
        for (Student student : students) {
            out.println(student.getName());
        }
    }
}

public class Bidirectional {

    public static void main(String[] args) {
        //Courses
        Subject java = new Subject("Java Programming");
        Subject sysDesign = new Subject("System Design");
        Subject cpp = new Subject("C++ Programming");
        Subject linux = new Subject("Linux");

        //Students
        Student std1 = new Student("Peter Parker");
        Student std2 = new Student("Tom Shayer");

        //Enroll student one
        std1.enroll(java);
        std1.enroll(sysDesign);
        std1.enroll(linux);

        //Enroll student two
        std2.enroll(linux);
        std2.enroll(java);
        std2.enroll(cpp);

        // sysDesign.showStudents();

        std1.showCourses();
    }
}