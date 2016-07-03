package citbyui.cit360.davisdanny.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

	public static void main(String[] args) {
		UserDetails user = new UserDetails();
		user.setUserId(1);
		user.setUserName("First User");
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		
		
		session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		UserDetails dbUser = (UserDetails) session.get(UserDetails.class, 1);
		System.out.println(dbUser.getUserId()+": "+dbUser.getUserName());
		
		session.getTransaction().commit();
		
	}

}
