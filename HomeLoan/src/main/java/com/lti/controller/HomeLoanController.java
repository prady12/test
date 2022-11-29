package com.lti.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lti.beans.PersonalDetail;
import com.lti.beans.ApplicationStatus;
import com.lti.beans.IncomeDetail;
import com.lti.beans.Loan;
import com.lti.beans.Property;
import com.lti.beans.Customer;
import com.lti.services.HomeLoanService;

@CrossOrigin(origins="*")
@RequestMapping("/homeloanappln")
@RestController
public class HomeLoanController {

	@Autowired
	public HomeLoanService hlService;
	
	@PostMapping("/adduser")
	public boolean registerUser(@RequestBody Customer user) {
		return hlService.registerUser(user);
	}
	
	
	//
	@PostMapping("/addapplninfo")
	public boolean AddApplicantInfo(@RequestBody PersonalDetail applicant) {
		System.out.println("inside the controller"+applicant);
		return hlService.addApplicationInfo(applicant);
		
	}
	
	@PostMapping("/userlogin")
	public Customer userlogin(@RequestBody Customer user) {
		return hlService.loginProcess(user);
		
	}
	
	@PostMapping("/addincome-salaried")
	public boolean addIncomeDetails(@RequestBody IncomeDetail incomeSalaried) {
		return hlService.addIncomeDetails(incomeSalaried);
	}
	
	
	
	@PostMapping("/addpropertydet")
	public boolean AddPropertyInfo(@RequestBody Property property) {
	return hlService.addPropertyInfo(property);
	}
	
	
	@PostMapping("/addloandet")
	public boolean addLoanInfo(@RequestBody Loan loan) {
		return hlService.addLoanInfo(loan);
		}
	
	
	
	
	@PostMapping("/addappstatus")
	public boolean AddApplnStatus(@RequestBody ApplicationStatus applnStatus){
		return hlService.addApplicationStatus(applnStatus);
	}
	
	
	
}