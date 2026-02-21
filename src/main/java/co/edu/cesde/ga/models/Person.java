package co.edu.cesde.ga.models;

public class Person {

    Long userIl;
    String code;
    String documentNumber;
    String firstName;
    String lastName;
    Boolean status;

    public Person() {
    }

    public Person(Long userIl, String code, String documentNumber, String firstName, String lastName, Boolean status) {
        this.userIl = userIl;
        this.code = code;
        this.documentNumber = documentNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.status = status;
    }

    public Long getUserIl() {
        return userIl;
    }

    public void setUserIl(Long userIl) {
        this.userIl = userIl;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}

