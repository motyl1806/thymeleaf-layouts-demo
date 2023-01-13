package com.wsb.logintegra.thymeleaflayout.person;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/person")
public class PersonController {

    @GetMapping("/")
    public String list(Model model) {
        System.out.println("list users " + Person.people.size());
        model.addAttribute("people", Person.people);
        return "person/list";
    }

    @GetMapping("/show/{id}")
    public String show(Model model, @PathVariable Integer id) {
        System.out.println("show user " + id);
        model.addAttribute("person", Person.findById(id));
        return "person/show";
    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("person", new Person());
        return "person/add";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("person") Person newPerson) {
        System.out.println("new person");
        System.out.println(newPerson);
        Person.people.add(newPerson);
        return "person/show";
    }
}
