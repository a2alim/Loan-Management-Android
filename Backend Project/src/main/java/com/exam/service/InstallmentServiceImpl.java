package com.exam.service;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.dao.ApplyLoanDaoImpl;
import com.exam.dao.InstallmentDaoImpl;
import com.exam.model.ApplyLoan;
import com.exam.model.Installment;
import com.exam.model.UserInfo;

@Service
@Transactional
public class InstallmentServiceImpl implements CommonService<Installment> {
	
	@Autowired
	InstallmentDaoImpl installmentDaoImpl;

	@Override
	public Installment save(Installment installment) {
		
		return installmentDaoImpl.save(installment);
	}

	@Override
	public Installment update(Installment installment) {
		return installmentDaoImpl.update(installment);
	}

	

	@Override
	public UserInfo getUserByEmail(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Installment getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Installment> getByLoanId(long id) {
		return installmentDaoImpl.getByLoanId(id);
	}
	
	@Override
	public List<Installment> getAll() {
		
		return installmentDaoImpl.getAll();
	}

	@Override
	public ApplyLoan update(ApplyLoan entity) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	
}
