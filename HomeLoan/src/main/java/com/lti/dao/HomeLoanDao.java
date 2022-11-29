package com.lti.dao;

import com.lti.beans.PersonalDetail;
import com.lti.beans.ApplicationStatus;

import com.lti.beans.IncomeDetail;
import com.lti.beans.Loan;
import com.lti.beans.Property;
import com.lti.beans.Customer;

public interface HomeLoanDao {

	public boolean registerUser(Customer users);
	public boolean addApplicationInfo(PersonalDetail applicant);
	public Customer loginProcess(Customer users);
	public boolean addIncomeDetails(IncomeDetail incomeSalaried);
	public boolean addPropertyInfo(Property property);
	public boolean addLoanInfo(Loan loan);
    public boolean addApplicationStatus(ApplicationStatus applicationStatus);
	public Customer send(String to);
}
