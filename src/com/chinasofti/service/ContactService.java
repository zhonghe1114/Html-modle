package com.chinasofti.service;

import java.util.ArrayList;
import java.util.List;

import com.chinasofti.domain.Contact;


public class ContactService {

	public List<Contact> getContacts(){
		List<Contact> contacts = new ArrayList<Contact>();
		contacts.add(new Contact(34, "����", "1398320333"));
		contacts.add(new Contact(39, "����", "1332432444"));
		contacts.add(new Contact(67, "����", "1300320333"));
		return contacts;
	}
}
