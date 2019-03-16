package com.swayam.demo.web.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.swayam.demo.web.rest.model.Person;
import com.swayam.demo.web.rest.service.PersonService;

@Controller
public class PersonController {

    private PersonService personservice;

    @Autowired
    public PersonController(PersonService personservice) {
        this.personservice = personservice;
    }

    @RequestMapping(path = { "person.jsp", "person.html", "person" }, method = { RequestMethod.GET })
    public ModelAndView showAddPersonPage() {
        return new ModelAndView("person");
    }

    @RequestMapping(path = "/person", method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public ModelAndView addPerson(@ModelAttribute Person person) {
        personservice.savePerson(person);
        return new ModelAndView("person", "person", person);
    }

}
