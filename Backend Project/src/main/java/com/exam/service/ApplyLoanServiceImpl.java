package com.exam.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.dao.ApplyLoanDaoImpl;
import com.exam.model.ApplyLoan;
import com.exam.model.UserInfo;

@Service
@Transactional
public class ApplyLoanServiceImpl implements CommonService<ApplyLoan> {
	
	@Autowired
	ApplyLoanDaoImpl applyLoanDaoImpl;

	@Override
	public ApplyLoan save(ApplyLoan applyLoan) {
		
		return applyLoanDaoImpl.save(applyLoan);
	}

	@Override
	public ApplyLoan update(ApplyLoan entity) {
		return applyLoanDaoImpl.update(entity);
	}

	public ApplyLoan updateLoan(Long id, String approved) {
		return applyLoanDaoImpl.updateLoan(id, approved);
	}
	
	@Override
	public boolean delete(long id) {
		// TODO Auto-generated method stub
		return applyLoanDaoImpl.delete(id);
	}

	@Override
	public ApplyLoan getById(long id) {
		
		return applyLoanDaoImpl.getById(id);
	}

	@Override
	public List<ApplyLoan> getAll() {
		return applyLoanDaoImpl.getAll();
	}

	public List<ApplyLoan> getAllLoan(){
		return applyLoanDaoImpl.getAllLoan();
	}
	
	@Override
	public UserInfo getUserByEmail(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<ApplyLoan> getUserLoanStatus(String currentUser){
		
		return applyLoanDaoImpl.getUserLoanStatus(currentUser);
	}

	
}
