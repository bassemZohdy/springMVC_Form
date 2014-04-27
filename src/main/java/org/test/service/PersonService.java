package org.test.service;

import java.util.List;

import org.test.model.Person;

public interface PersonService {

	List<Person> getAllPersons();

	void addPerson(Person person);
}
