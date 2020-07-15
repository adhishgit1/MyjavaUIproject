package com.adhish.repo;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.adhishWeb.model.Mydb;

public interface Myrepo extends MongoRepository<Mydb, String>{
	
	Mydb findByname(String name);
	Mydb findByage(String age);
	Mydb findByskill(String skill);
	
	Mydb findBy_id(ObjectId _id);

}
