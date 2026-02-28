package co.edu.cesde.ga.app;

import co.edu.cesde.ga.models.Person;
import co.edu.cesde.ga.models.Student;

public class Main {
    public static void main (String [] arg) {
        System.out.println("Hola mundo");
        Person person = new Person();
        Person person2= new Person();
        Person person3= new Person();

        person.setFirstName("Genesis");
        person.getFirstName();
        person2.setFirstName("Luisa");
        person2.getFirstName();
        person3.setFirstName("Yurany");
        person3.getFirstName();

        Person person4 = new Person(1L,"123","1036691336","Genesis","Quiñonez",true);

        System.out.println(person.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());
        System.out.println(person4.toString());

        Student student = new Student();
        person.setFirstName("Maria");
        person.setBirthDate("2002-04-22");
        System.out.println(Student.tostring());


}
