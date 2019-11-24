package com.example.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Person;
import com.example.serviceImpl.PersonServiceImpl;

@RestController
@RequestMapping(value = "/person")
public class PersonController {

	@Autowired
	private PersonServiceImpl personService;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Optional<Person> findPersonById(@PathVariable(name = "id") Integer id) {
		return personService.getPersonById(id);
	}
}
