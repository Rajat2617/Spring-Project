package com.jspiders.spring.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jspiders.spring.dto.UserDTO;

@Repository
public class RegistrationDAO {

	@Autowired
	private SessionFactory factory;

	public Integer saveUser(UserDTO userDTO) {
		Transaction tx = null;
		Integer identifier = null;
		try (Session session = factory.openSession()) {
			tx = session.beginTransaction();
			identifier = (Integer) session.save(userDTO);
			tx.commit();
		} catch (HibernateException e) {
			tx.rollback();
			e.printStackTrace();
		}
		return identifier;
	}

	public UserDTO verify(String username, String password) {
		String qry = "SELECT user FROM UserDTO user WHERE user.username=:uName AND user.password=:uPwd";
		UserDTO userDTO = null;
		try (Session session = factory.openSession()) {
			Query query = session.createQuery(qry);
			query.setParameter("uName", username);
			query.setParameter("uPwd", password);
			userDTO = (UserDTO) query.uniqueResult();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return userDTO;
	}

	public Integer update(Long mobileNumber, String emailID, String caddress, String paddress, String username,
			String password) {
		String qry = "UPDATE UserDTO user SET user.mobileNumber=:mn,user.emailID=:eid,user.caddress=:cadd,user.paddress=:padd WHERE user.username=:uName AND user.password=:uPwd";
		Transaction tx = null;
		Integer identifier = null;
		try (Session session = factory.openSession()) {
			tx = session.beginTransaction();
			Query query = session.createQuery(qry);
			query.setParameter("mn", mobileNumber);
			query.setParameter("eid", emailID);
			query.setParameter("cadd", caddress);
			query.setParameter("padd", paddress);
			query.setParameter("uName", username);
			query.setParameter("uPwd", password);
			identifier = query.executeUpdate();
			tx.commit();
		} catch (HibernateException e) {
			tx.rollback();
			e.printStackTrace();
		}
		return identifier;
	}

	public Integer updatePassword(String username, String oldpassword, String newpassword) {
		String qry = "UPDATE UserDTO user SET user.password=:newPwd WHERE user.username=:uName AND user.password=:uPwd";
		Transaction tx = null;
		Integer identifier = null;
		try (Session session = factory.openSession()) {
			tx = session.beginTransaction();
			Query query = session.createQuery(qry);
			query.setParameter("uName", username);
			query.setParameter("uPwd", oldpassword);
			query.setParameter("newPwd", newpassword);
			identifier = (Integer) query.executeUpdate();
			tx.commit();
		} catch (HibernateException e) {
			tx.rollback();
			e.printStackTrace();
		}
		return identifier;
	}
}
