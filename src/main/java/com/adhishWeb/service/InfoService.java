package com.adhishWeb.service;

import java.util.List;

import com.adhishWeb.model.Mydb;

public interface InfoService {
	List<Mydb> findAll();
	Mydb findByname(String name);
	Mydb findByage(String age);
	Mydb findByskill(String skill);
	
	void saveorUpdatedata(Mydb mydb);
	
	void deleteData(String id);

} 
