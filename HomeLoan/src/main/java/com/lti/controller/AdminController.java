package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.beans.Admin;
import com.lti.beans.Customer;
import com.lti.beans.PersonalDetail;
import com.lti.services.AdminServiceImpl;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/adminController")
public class AdminController {

	@Autowired
	public AdminServiceImpl adminServiceIntf;

	@PostMapping(value = "/adminlogin")
	public boolean adminlogin(@RequestBody Admin admin) {
		return adminServiceIntf.adminLogin(admin);

	}

	@GetMapping(value = "/pending")
	public List<PersonalDetail> getPendingList() {
		List<PersonalDetail> penlst = adminServiceIntf.viewPendingApprovals();
		return penlst;

	}

	@GetMapping("/getallcustomer")
	public List<Customer> getAllCustomer() {
		List<Customer> penlst = adminServiceIntf.getAllCustomer();
		return penlst;
	}

}
