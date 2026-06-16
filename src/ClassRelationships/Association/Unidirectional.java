package ClassRelationships.Association;

import static java.lang.System.out;

record Teacher(String name) {
}

//Course knows teacher but vice versa is not true
class Course {
    private final Teacher teacher;

    public Course(Teacher teacher) {
        this.teacher = teacher;
    }

    public void display() {
        out.println("Course taught by: " + teacher.name());
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
 * Note: The Association and Aggregation are same at code level they differ conceptually (phycologically)
 * The Aggregation and Composition are specialized type of Association
 * **/