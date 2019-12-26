package com.exam.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exam.model.ApplyLoan;
import com.exam.model.Installment;
import com.exam.model.UserInfo;
@Repository
public class InstallmentDaoImpl implements CommonDao<Installment> {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public Installment save(Installment installment) {
		
		try {
			sessionFactory.getCurrentSession().save(installment);
			return (installment) ;
		} catch (HibernateException e) {
			return null;
		}

	}

	@Override
	public ApplyLoan update(ApplyLoan entity) {
		try {
			sessionFactory.getCurrentSession().update(entity);
			return (entity) ;
		} catch (HibernateException e) {
			return null;
		}
	}
	

	

	@Override
	public boolean delete(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Installment getById(long id) {
		try {
			Installment entity = sessionFactory.getCurrentSession().get(Installment.class, id);
			return entity;
		} catch (HibernateException e) {
			return null;
		}
	}
	
	public List<Installment> getByLoanId(long id) {
		
		
		try {
			List<Installment> installmentList =(List<Installment>) sessionFactory.getCurrentSession().createQuery("From Installment where loanId = '"+id+"' ").list();
			return installmentList;
		} catch (HibernateException e) {
			return null;
		}
	}

	@Override
	public List<Installment> getAll() {
		
		List<Installment> ins = sessionFactory.getCurrentSession().createQuery("From Installment").list();
		return ins;
	}

	public List<ApplyLoan> getUserLoanStatus(String currentUser) {
		return null;
	}

	
	@Override
	public Installment update(Installment entity) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
