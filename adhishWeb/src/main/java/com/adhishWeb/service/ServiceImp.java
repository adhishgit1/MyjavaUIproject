package com.adhishWeb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adhish.repo.Myrepo;
import com.adhishWeb.model.Mydb;

@Service
public class ServiceImp implements InfoService {
	
	@Autowired
    private Myrepo myrepo;

	@Override
	public List<Mydb> findAll() {
		// TODO Auto-generated method stub
		return myrepo.findAll();
	}

	@Override
	public Mydb findByname(String name) {
		// TODO Auto-generated method stub
		return myrepo.findByname(name);
	}

	@Override
	public Mydb findByage(String age) {
		// TODO Auto-generated method stub
		return myrepo.findByage(age);
	}

	@Override
	public Mydb findByskill(String skill) {
		// TODO Auto-generated method stub
		return myrepo.findByskill(skill);
	}

	@Override
	public void saveorUpdatedata(Mydb mydb) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteData(String id) {
		// TODO Auto-generated method stub
		
	}

}
