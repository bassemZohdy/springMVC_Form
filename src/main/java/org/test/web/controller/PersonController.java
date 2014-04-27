package org.test.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.test.model.Gender;
import org.test.model.Person;
import org.test.service.PersonService;

@Controller
@RequestMapping(value = "person")
public class PersonController {

	@Autowired
	private PersonService personService;

	@RequestMapping(value = "viewAll", method = RequestMethod.GET)
	public ModelAndView viewAll() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("personViewAll");
		mav.addObject("persons", personService.getAllPersons());
		return mav;
	}

	@RequestMapping(value = "new", method = RequestMethod.GET)
	public ModelAndView newPerson() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("newPerson");
		mav.addObject("person", new Person());
		return mav;
	}

	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String add(@ModelAttribute(value = "person") Person person) {
		personService.addPerson(person);
		return "redirect:viewAll.htm";
	}
	
	@ModelAttribute(value="genders")
	public Gender[] getGender(){
		return Gender.values();
	}

}
