package com.lti.services;

import com.lti.beans.PersonalDetail;
import com.lti.beans.ApplicationStatus;

import com.lti.beans.IncomeDetail;

import com.lti.beans.Loan;
import com.lti.beans.Property;
import com.lti.beans.Customer;

public interface HomeLoanService {

	public boolean registerUser(Customer users);
	public boolean addApplicationInfo(PersonalDetail applicant);
	public Customer loginProcess(Customer users);
	public boolean addIncomeDetails(IncomeDetail income);
	public boolean addPropertyInfo(Property property);
	public boolean addLoanInfo(Loan loan);
	
	public boolean addApplicationStatus(ApplicationStatus applicationStatus);
}
