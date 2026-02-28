package co.edu.cesde.ga.models;

public class Student extends  Person{

    private String birthDate;

    public Student(){
        super();
    }

    public Student(Long userIl, String code, String documentNumber, String firstName, String lastName, Boolean status, String birthDate) {
        super(userIl, code, documentNumber, firstName, lastName, status);
        this.birthDate = birthDate;


        public String getBirthDate () {
            return birthDate;
        }

        public void setBirthDate (String birthDate){
            this.birthDate = birthDate;
        }
        public String toString(){
            return"Student = " + super.toString() +
                    "birthDte ='" + birthDate + '\'';

        }
