package org.test.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.test.model.Person;
import org.test.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	private static List<Person> persons = new ArrayList<Person>();

	public List<Person> getAllPersons() {
		return persons;
	}

	public void addPerson(Person person) {
		persons.add(person);
	}

}
