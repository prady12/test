package com.lti.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;



import com.lti.beans.PersonalDetail;
import com.lti.beans.ApplicationStatus;

import com.lti.beans.IncomeDetail;
import com.lti.beans.Loan;
import com.lti.beans.Property;
import com.lti.beans.Customer;



@Repository("homeLoanDao")
public class HomeLoanDaoImpl implements HomeLoanDao {

	@PersistenceContext
	EntityManager em;
	
	@Transactional
	public boolean registerUser(Customer users) {
		
		 boolean flag=false;
		    try {
			   
				em.persist(users);
				
				System.out.println("end");
				flag=true;
		    }
		    catch(Exception e) { 
		    	System.out.println("Error:"+e);
		    }
		    return flag;
	}
	
	@Transactional
	public boolean addApplicationInfo(PersonalDetail applicant) {
		
		boolean flag=false;
	    try {
		    
			em.persist(applicant);
			
			System.out.println("Done");
			flag=true;
	    }
	    catch(Exception e) { 
	    	System.out.println("Error:"+e);
	    }
	    return flag;
	}

	@Transactional
	public Customer loginProcess(Customer users) {
		
		int flag = 0;
		Customer u = null;
		 try {
			   
				String emailid =  users.getCustEmail();
				String password = users.getCustPassword();
				u = (Customer)em.createQuery("select u from User u where  u.email=:emailid").setParameter("emailid", emailid).getSingleResult();
				if(( u.getCustEmail().equals(emailid) ) && ( u.getCustPassword().equals(password) ) ) {
					
					flag = 1;
				}
				else flag = 0;
			
		    }
		    catch(Exception e) { 
		    	System.out.println("Error:"+e);
		    }
		 if(flag == 1)
		 	return u;
		 else return null;
		}

	@Transactional
	public boolean addIncomeDetails(IncomeDetail incomeSalaried) {

		 boolean flag=false;
		    try {
			   
				em.persist(incomeSalaried);
				
				System.out.println("end");
				flag=true;
		    }
		    catch(Exception e) { 
		    	System.out.println("Error:"+e);
		    }
		    return flag;
	}

	

	public boolean addPropertyInfo(Property property) {
		 boolean flag=false;
		    try {
			   
				em.persist(property);
				
				System.out.println("end");
				flag=true;
		    }
		    catch(Exception e) { 
		    	System.out.println("Error:"+e);
		    }
		    return flag;
	}

	public boolean addLoanInfo(Loan loan) {
		 boolean flag=false;
		    try {
			   
				em.persist(loan);
				
				System.out.println("end");
				flag=true;
		    }
		    catch(Exception e) { 
		    	System.out.println("Error:"+e);
		    }
		    return flag;
	}


	public boolean addApplicationStatus(ApplicationStatus applicationStatus) {
		
		boolean flag=false;
	    try {
		   
			em.persist(applicationStatus);
			
			System.out.println("end");
			flag=true;
	    }
	    catch(Exception e) { 
	    	System.out.println("Error:"+e);
	    }
	    return flag;
	}

	public Customer send(String to) {
		Customer u = (Customer)em.createQuery( "select u from Users u where u.email=:email").setParameter("email", to).getSingleResult();
		return u;
	}


	
}
