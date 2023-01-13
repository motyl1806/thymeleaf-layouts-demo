package com.wsb.logintegra.thymeleaflayout;

import com.wsb.logintegra.thymeleaflayout.person.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class ThymeleafLayoutApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThymeleafLayoutApplication.class, args);
        Person.people = new ArrayList<>();
        Person.people.add(new Person(1, "kacper", "kacper.warda@logintegra.com", true, "ADMIN"));
        Person.people.add(new Person(2, "pioter", "pioter.warda@logintegra.com", true, "USER"));
        Person.people.add(new Person(3, "janusz", "janusz.warda@logintegra.com", true, "USER"));
    }

}
