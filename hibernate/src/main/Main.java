package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration()
				.configure("hibernate-config.xml")
				.addAnnotatedClass(User.class)
				.buildSessionFactory();
		User user = new User();
		user.setName("Radwan");

		Session session = sessionFactory.getCurrentSession();

		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
	}
}