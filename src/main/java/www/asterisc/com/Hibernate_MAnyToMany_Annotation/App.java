package www.asterisc.com.Hibernate_MAnyToMany_Annotation;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import www.asterisc.com.Hibernate_MAnyToMany_Annotation.model.Emp;
import www.asterisc.com.Hibernate_MAnyToMany_Annotation.model.Project;

public class App 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction t = session.beginTransaction();
		
		Emp e1= new Emp();
		Emp e2 = new Emp();
		
		e1.setEid(101);
		e1.setEname("Nikita");
		
		e2.setEid(102);
		e2.setEname("Ram");
		
		Project p1= new Project();
		Project p2= new Project();
		
		p1.setPid(1);
		p1.setProjectname("Student Management Project");
		
		p2.setPid(2);
		p2.setProjectname("Electricity Billing System ");
		
		List<Emp>list1= new ArrayList<>();
		List<Project>list2= new ArrayList<>();
		
		list1.add(e1);
		list1.add(e2);
		
		list2.add(p1);
		list2.add(p2);
		
		e1.setProjects(list2);
        e2.setProjects(list2);
        
        p1.setEmps(list1);
        p2.setEmps(list1);
		
        session.save(e1);
		session.save(e2);
		session.save(p1);
		session.save(p2);


		
		t.commit();
		
		session.close();

		System.out.println("Data inserted succesfully");

		
}
}