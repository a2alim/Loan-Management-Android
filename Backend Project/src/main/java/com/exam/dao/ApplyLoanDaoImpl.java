package com.exam.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exam.model.ApplyLoan;
import com.exam.model.UserInfo;
@Repository
public class ApplyLoanDaoImpl implements CommonDao<ApplyLoan> {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public ApplyLoan save(ApplyLoan applyLoan) {
		
		try {
			sessionFactory.getCurrentSession().save(applyLoan);
			return (applyLoan) ;
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
	

	public ApplyLoan updateLoan(Long id, String status) {
		try {
			ApplyLoan applyLoan = sessionFactory.getCurrentSession().get(ApplyLoan.class, id);
			
			if (!status.isEmpty()) {
				applyLoan.setStatus(status);
			}else {
				applyLoan.setStatus("pending");
			}
			sessionFactory.getCurrentSession().saveOrUpdate(applyLoan);
			return applyLoan;
		} catch (HibernateException e) {
			return null;
		}
	}

	@Override
	public boolean delete(long id) {
		try {
			ApplyLoan loan = sessionFactory.getCurrentSession().get(ApplyLoan.class, id);
			sessionFactory.getCurrentSession().delete(loan);
			return true;
		} catch (HibernateException e) {
			return false;
		}
	}

	@Override
	public ApplyLoan getById(long id) {
		try {
			ApplyLoan entity = sessionFactory.getCurrentSession().get(ApplyLoan.class, id);
			return entity;
		} catch (HibernateException e) {
			return null;
		}
	}

	@Override
	public List<ApplyLoan> getAll() {
		List<ApplyLoan> pendingLoanList = (List<ApplyLoan>)sessionFactory.getCurrentSession().createQuery("From ApplyLoan where status='pending' OR status= 'waiting' OR status= 'rejected' ").setFetchSize(50).list();
		return pendingLoanList;
	}
	
	public List<ApplyLoan> getAllLoan() {
		List<ApplyLoan> loanList = (List<ApplyLoan>)sessionFactory.getCurrentSession().createQuery("From ApplyLoan").setFetchSize(50).list();
		return loanList;
	}

	public List<ApplyLoan> getUserLoanStatus(String currentUser) {
		List<ApplyLoan> userLoanStatus = (List<ApplyLoan>)sessionFactory.getCurrentSession().createQuery("From ApplyLoan where username='"+currentUser+"' ").setFetchSize(50).list();
		return userLoanStatus;
	}
	
}
