package ClassRelationships;

import static java.lang.System.out;

//Contained class
class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

//Container class
class College {
    private Student student;

    public void setStudent(Student student) {
        this.student = student;
    }

    void showStudent() {
        out.println("College has: " + student.getName());
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Student student = new Student("Peter Parker");
        College college = new College();
        college.setStudent(student);
        college.showStudent();
    }
}

/*
 * Type: Weak HAS-A (Loose coupling)
 * Ownership: No class object owns another
 * Lifecycle: Both class objects can live independently
 * **/
