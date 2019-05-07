package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;

@RestController
public class Student {

	@Value("${myresponse}")
	String response;
	
	@GetMapping("/ping")
	public String name()
	{
		return response;
	}

	@GetMapping("/hello/employee")
	public Employee rollno()
	{
		Employee e = new Employee();
		e.setName("Amir");
		e.setAge("22");
		return e;
	}
	
	@GetMapping("/hello/{rollno}")
	public int rollno(@PathVariable int rollno)
	{
		return rollno;
	}
	
	@PostMapping("/hello")
	public Employee rollno(@RequestBody Employee e)
	{
	
		return e;
	}
}
