package com.example.DAOImpl;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Person;

public interface PersonDAO extends PagingAndSortingRepository<Person, Integer>{

	
}
