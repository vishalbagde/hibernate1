
package main;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {

		Dept d1 = new Dept();
		d1.setDept_no(101);
		d1.setDept_name("pur");
		d1.setLoc("surat");
		
		/*
		Properties properties =new Properties();
		try
		{
			properties.load(ClassLoader.getSystemClassLoader().getResourceAsStream("hibernate.properties"));
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		*/
		Configuration conf = new Configuration().configure().addAnnotatedClass(Dept.class);
		SessionFactory sf = conf.buildSessionFactory();
		Session session = sf.openSession();
		session.save(d1);

	}
}
