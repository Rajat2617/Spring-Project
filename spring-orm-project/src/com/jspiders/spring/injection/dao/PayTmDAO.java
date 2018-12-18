package com.jspiders.spring.injection.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.jspiders.spring.injection.dto.PayTmDTO;

//@Component
@Repository
public class PayTmDAO {

	@Autowired
	private SessionFactory factory;

	public void savePayTm(PayTmDTO payTmDTO) {
		Transaction tx = null;
		try (Session session = factory.openSession();) {
			tx = session.beginTransaction();
			session.save(payTmDTO);
			tx.commit();
		} catch (HibernateException e) {
			tx.rollback();
			e.printStackTrace();
		}

	}
}
