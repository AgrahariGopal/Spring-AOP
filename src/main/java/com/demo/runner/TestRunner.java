package com.demo.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.demo.dao.EmployeeDao;

@Component
public class TestRunner implements CommandLineRunner{

	@Autowired
	private EmployeeDao dao;
	
	@Override
	public void run(String... args) throws Exception {
		dao.saveEmployee();
		
	}

}
