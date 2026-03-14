package co.edu.cesde.ga.models;

public class Teacher extends Person{

    public Teacher(){
        super();
    }

    public Teacher(Long userIl, String code, String documentNumber, String firstName, String lastName, Boolean status) {
        super(userIl, code, documentNumber, firstName, lastName, status);
    }
    public String toString() {
        return "Teacher{}"+ super.toString();


    }
}

