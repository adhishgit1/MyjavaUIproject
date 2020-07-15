package com.adhishWeb.controller;



import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adhish.repo.Myrepo;
import com.adhishWeb.model.Mydb;
import com.adhishWeb.service.InfoService;

@RestController
@RequestMapping("/mydata")
public class MyMongoController {
	 
	@Autowired
	private InfoService infoservice;
	
	@GetMapping(path = "/hello")
		public String hello() {
		return "hellow World";
	}
	
	@GetMapping(value = "/")
    public List<Mydb> getAllStudents() {
		System.out.println("myMongoModel");
        return infoservice.findAll();
    }
	
	@GetMapping(value = "/{name}")
    public Mydb getName(@PathVariable("name") String name) {
        return infoservice.findByname(name);
    }
	
	 @GetMapping(value = "/{age}")
	    public Mydb getAge(@PathVariable("age") String age) {
	        return infoservice.findByage(age);
	    }
	 
	 @GetMapping(value = "/{skill}")
	    public Mydb getSkill(@PathVariable("skill") String skill) {
	        return infoservice.findByage(skill);
	    }
//	 
//	 @PostMapping(value = "/")
//	    public ResponseEntity<?> saveOrUpdateStudent(@RequestBody Mydb mydb) {
//	        infoservice.saveorUpdatedata(mydb);
//	        return new ResponseEntity("Student added successfully", HttpStatus.OK);
//	    }
//	 
	 
	
}

