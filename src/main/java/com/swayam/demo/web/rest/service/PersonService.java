package com.swayam.demo.web.rest.service;

import com.swayam.demo.web.rest.model.Person;

public interface PersonService {
    boolean savePerson(Person person);

    String getPersons(Person person);
}
