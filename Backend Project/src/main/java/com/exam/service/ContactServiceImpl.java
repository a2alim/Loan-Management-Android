package com.exam.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.dao.ContactDaoImpl;
import com.exam.model.ApplyLoan;
import com.exam.model.Contact;
import com.exam.model.UserInfo;

@Service
@Transactional
public class ContactServiceImpl implements CommonService<Contact> {

	@Autowired
	ContactDaoImpl contactDao;

	@Override
	public Contact save(Contact contact) {
		return contactDao.save(contact);
	}

	@Override
	public Contact update(Contact entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Contact getById(long id) {

		return contactDao.getById(id);
	}

	@Override
	public List<Contact> getAll() {

		return contactDao.getAll();
	}

	public List<Contact> getContactById(Long id) {

		return contactDao.getContactById(id);
	}

	@Override
	public UserInfo getUserByEmail(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ApplyLoan update(ApplyLoan entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
