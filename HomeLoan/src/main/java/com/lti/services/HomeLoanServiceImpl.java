package com.lti.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.PersonalDetail;
import com.lti.beans.ApplicationStatus;

import com.lti.beans.IncomeDetail;
import com.lti.beans.Loan;
import com.lti.beans.Property;
import com.lti.beans.Customer;
import com.lti.dao.HomeLoanDao;



@Service("homeLoanService")
public class HomeLoanServiceImpl implements HomeLoanService {

	@Autowired
	public HomeLoanDao homeLoanDao;
	
	@Transactional
	public boolean registerUser(Customer users) {
		
		return homeLoanDao.registerUser(users);
	}
	
	@Transactional
	public boolean addApplicationInfo(PersonalDetail applicant) {
		
		return homeLoanDao.addApplicationInfo(applicant);
	}

	@Transactional
	public Customer loginProcess(Customer users) {

		return homeLoanDao.loginProcess(users);
	}

	@Transactional
	public boolean addIncomeDetails(IncomeDetail incomeSalaried) {
		return homeLoanDao.addIncomeDetails(incomeSalaried);
	}


	@Transactional
	public boolean addPropertyInfo(Property property) {
		return homeLoanDao.addPropertyInfo(property);
	}

	@Transactional
	public boolean addLoanInfo(Loan loan) {
		return homeLoanDao.addLoanInfo(loan);
	}

	

	@Transactional
	public boolean addApplicationStatus(ApplicationStatus applicationStatus) {
		return homeLoanDao.addApplicationStatus(applicationStatus);
	}
	
	
	
}
