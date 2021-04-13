package SpringJDBC;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;


public class q_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("hibernate.xml");
		HiberDAO hib =(HiberDAO)context.getBean("d");  
		Student[] st = new Student[100];
		for (int i=1;i<=100;i++) {
			Student s = (Student) context.getBean("s");
			s.setSid(100+i);
			s.setSname("Student"+Integer.toString(i));
			s.setSadd("City"+Integer.toString(i));
			st[i-1] = s;
			hib.saveStudent(s);
		}
		getAllDetails(st);
		System.out.println("----------------------------");
		getDetail(107,st);
		
	}
	
	public static void getAllDetails(Student[] st) {
		for (Student s : st) {
			System.out.println(s.sid+"  "+s.sname+"  "+s.sadd);
		}
	}
	
	public static void getDetail(int id, Student[] st) {
		for (Student s : st) {
			if (s.sid == id) {System.out.println(s.sname+"  "+s.sadd);}
		}
		
	}

	

}
