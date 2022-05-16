package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestPerson {

	public static void main(String[] args) {
		System.out.println("Storing the data");
		try{
		    //creating configuration object  
		    	  System.out.println("111111111111111111111");
		    Configuration cfg=new Configuration();
		    System.out.println("2222222222222222222222222222");
		    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
		    System.out.println("3333333333333333333333333333");
		    //creating seession factory object  
		    SessionFactory factory=cfg.buildSessionFactory();  
		    System.out.println("4444444444444444444444444");
		    //creating session object  
		    Session session=factory.openSession();  
		    System.out.println("5555555555555555555555555");
		    //creating transaction object  
		    Transaction t=session.beginTransaction();  
		    System.out.println("66666666666666666666666666666666");
		    PersonInfo in=new PersonInfo();
		    in.setInfoID("100");
		    in.setAddress("jp");
		    in.setIncome(1234);
		    in.setJob("manager");
		    Person p=new Person();
		    p.setPersonDetail(in);
		    p.setPersonID("p001");
		    p.setPersonName("john");
		    System.out.println("7777777777777777777777777777777");
		    session.save(p);//persisting the object  
		    System.out.println("888888888888888888888888888888");
		    t.commit();//transaction is committed  
		    session.close();  
		      
		    System.out.println("successfully saved");  
		      }catch(Exception ex)
		      {
		    	  System.out.println("Problem in connection"+ex.getMessage());
		    	  System.out.println(ex.getCause());
		    	 
		      }		

	}

}
