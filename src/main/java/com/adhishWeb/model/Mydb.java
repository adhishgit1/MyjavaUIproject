package com.adhishWeb.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Mydb {
	
		 @Id
		 public ObjectId _id;
		 public String name;
		 public String age;
		 public String skill;
		 
		public Mydb(ObjectId _id, String name, String age, String skill) {
			super();
			this._id = _id;
			this.name = name;
			this.age = age;
			this.skill = skill;
		}
		public ObjectId get_id() {
			return _id;
		}
		public void set_id(ObjectId _id) {
			this._id = _id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAge() {
			return age;
		}
		public void setAge(String age) {
			this.age = age;
		}
		public String getSkill() {
			return skill;
		}
		public void setSkill(String skill) {
			this.skill = skill;
		}
}
		 

