package inheritance;

import static java.lang.System.out;

class Teacher {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void teach(Student student) {
        out.println("Teacher : " + name + " teaches student: " + student.getName());
    }
}

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Association {
    public static void main(String[] args) {
         Teacher teacher = new Teacher("Tony Stark");
         Student student = new Student("Peter Parker");
         //Association between teacher and student
         teacher.teach(student);
    }
}
