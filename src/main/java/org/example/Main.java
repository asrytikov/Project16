package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

       /* People people = context.getBean(People.class);
        System.out.println(people);
        System.out.println(people.getName());
        */

        People people = new People();
        people.setName("Arsenij");

        People people1 = new People();
        people1.setName("Masha");

        Supplier<People> peopleSupplier = () -> people;
        Supplier<People> peopleSupplier1= () -> people1;


        context.registerBean("people1", People.class, peopleSupplier, bc -> bc.setPrimary(true));

        context.registerBean("people2", People.class, peopleSupplier1);

        People p = context.getBean("people2",People.class);
        System.out.println(p.getName());


    }
}