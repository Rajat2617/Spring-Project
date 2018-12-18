package com.jspiders.spring.injection.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jspiders.spring.injection.dto.LaptopDTO;

@Repository
public class LaptopDAO {

	@Autowired
	private SessionFactory factory;

	public void saveLaptop(LaptopDTO laptopDTO) {
		Transaction tx = null;
		try (Session session = factory.openSession();) {
			tx = session.beginTransaction();
			session.save(laptopDTO);
			tx.commit();
		} catch (HibernateException e) {
			tx.rollback();
			e.printStackTrace();
		}
	}

}
