package com.rajat.zomato.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rajat.zomato.dto.CustomerDTO;

@Repository
public class RegistrationDAO {

	@Autowired
	private SessionFactory factory;

	public Integer registerCustomer(CustomerDTO customerDTO) {
		Transaction tx = null;
		Integer identifier = null;
		try (Session session = factory.openSession()) {
			tx = session.beginTransaction();
			identifier = (Integer) session.save(customerDTO);
			tx.commit();
		} catch (HibernateException e) {
			tx.rollback();
			e.printStackTrace();
		}
		return identifier;
	}

	public CustomerDTO loginCustomer(String emailID, String password) {
		String qry = "SELECT cust FROM CustomerDTO cust WHERE cust.emailID=:cEmailId AND cust.password=:cPwd";
		CustomerDTO customerDTO = null;
		try (Session session = factory.openSession()) {
			Query query = session.createQuery(qry);
			query.setParameter("cEmailId", emailID);
			query.setParameter("cPwd", password);
			customerDTO = (CustomerDTO) query.uniqueResult();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return customerDTO;
	}

}
