package com.exam.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exam.model.ApplyLoan;
import com.exam.model.Contact;
@Repository
public class ContactDaoImpl implements CommonDao<Contact> {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public Contact save(Contact contact) {
		try {
			sessionFactory.getCurrentSession().save(contact);
			return (contact) ;
		} catch (HibernateException e) {
			return null;
		}

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
		return sessionFactory.getCurrentSession().get(Contact.class, id);
	}

	@Override
	public List<Contact> getAll() {
		
		return sessionFactory.getCurrentSession().createQuery("from Contact").list();
	}
	
	
	public List<Contact> getContactById(long id) {
		System.out.println(id);
		return sessionFactory.getCurrentSession().createQuery("from Contact where contactId = '"+id+"'").list();
	}


	@Override
	public ApplyLoan update(ApplyLoan entity) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
