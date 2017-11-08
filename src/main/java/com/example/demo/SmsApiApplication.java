package com.example.demo;
import java.util.*;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmsApiApplication {

	public static void main(String[] args) {

		//SpringApplication.run(SmsApiApplication.class, args);

		PhoneContacts phone = new PhoneContacts();

		phone.addContact(new Contact("A","+48692955680"));
		phone.addContact(new Contact("A","692655680"));
		phone.addContact(new Contact("B","+48693931170"));
		phone.addContact(new Contact("B","48693931170"));

		System.out.println(phone.size());

		for (Contact p : phone.getAllContacts()) {
			System.out.println(p.toString());
		}

	}
}
