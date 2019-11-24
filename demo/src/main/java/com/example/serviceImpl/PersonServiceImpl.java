package com.example.serviceImpl;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DAOImpl.PersonDAO;
import com.example.entity.Person;

@Service
@Transactional
public class PersonServiceImpl {

	@Autowired
	private PersonDAO personDao;
	
	public Optional<Person> getPersonById(int id) {
		return personDao.findById(id);
	}
}
