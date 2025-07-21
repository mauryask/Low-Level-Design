package ClassRelationships.Association;

import static java.lang.System.out;

class Teacher {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

//Course knows teacher but vice versa is not true
class Course {
    private Teacher teacher;

    public Course(Teacher teacher) {
        this.teacher = teacher;
    }

    public void display() {
        out.println("Course taught by: " + teacher.getName());
    }
}

public class Unidirectional {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Tony Stark");
        Course course = new Course(teacher);
        //Association between teacher and course
        course.display();
    }
}

/*
 * Two variants: Unidirectional and bidirectional
 * Type: Association
 * Ownership: No ownership between objects
 * Lifecycle: Both objects can live independently
 * **/