package co.edu.cesde.ga.app;

import co.edu.cesde.ga.models.Person;
import co.edu.cesde.ga.models.Student;
import co.edu.cesde.ga.models.Teacher;

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

        Person person4 = new Person(1L, "123", "1036691336", "Genesis", "Quiñonez", true);

        System.out.println(person.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());
        System.out.println(person4.toString());

        Student student = new Student();
        student.setFirstName("Santiago");
        student.setBirthDate("2000-01-11");
        System.out.println(student.toString());

        Teacher teacher = new Teacher();
        teacher.setFirstName("Leidy");
        teacher.setLastName("Mora");
        System.out.println(teacher.toString());

        Student student2 = new Student(21L, "006", "987654321", "Mariana", "Lopez", true, "2005-09-10");
        System.out.println(student2.toString());

        Teacher teacher2 = new Teacher(3L, "166", "103746474", "Alvaro", "Jimenez", true);
        System.out.println(teacher2.toString());

        //Constructor lleno-Estudiante
        Student student3 = new Student(21L, "986", "987799300", "Andrea", "Santos", true, "2001-03-10");
        System.out.println(student3.toString());

        //Constructor vacio-Estudiante
        Student student4 = new Student();
        student4.setFirstName("Valentina");
        student4.setLastName("García");
        student4.setBirthDate("2003-05-15");
        System.out.println(student4.toString());

        //Constructor lleno-Profesor
        Teacher teacher3 = new Teacher(3L, "124", "555866543", "Roman", "Rojas", true);
        System.out.println(teacher3.toString());

        //Constructor vacio-Profesor
        Teacher teacher4 = new Teacher();
        teacher4.setFirstName("Daniela");
        teacher4.setLastName("Soto");
        System.out.println(teacher4.toString());
    }
}



