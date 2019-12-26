package com.exam.service;

import java.util.List;

import com.exam.model.ApplyLoan;
import com.exam.model.UserInfo;

public interface CommonService <T>{
	public T save(T entity);
	public T update(T entity);
	public boolean delete(long id);
	public T getById(long id);
	public List<T> getAll(); 
	public UserInfo getUserByEmail(String email, String password);
	public ApplyLoan update(ApplyLoan entity);
}
