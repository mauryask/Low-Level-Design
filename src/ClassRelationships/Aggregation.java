package ClassRelationships;

import java.util.List;

import static java.lang.System.out;

class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


class Department {
    private String departmentName;
    private List<Professor> professors;

    public Department(String departmentName, List<Professor> professors) {
        this.departmentName = departmentName;
        this.professors = professors;
    }

    public void showProfessors() {
        out.println("Department: " + departmentName);
        for (Professor professor : professors) {
            out.println("Professor: " + professor.getName());
        }
        out.println();
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Tony Stark");
        Professor professor2 = new Professor("Brice Banner");
        List<Professor> professors = List.of(professor1, professor2);
        //(Weak Aggregation) Weak 'Has-A' relationship: Here departments and professors can exist independently
        Department department = new Department("Computer Science", professors);
        department.showProfessors();
    }
}
