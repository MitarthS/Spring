package SpringJDBC;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate5.HibernateTemplate;


public class HiberDAO {  
	HibernateTemplate template;  
	public void setTemplate(HibernateTemplate template) {  
	    this.template = template;  
	}  
	//method to save employee  
	public void saveStudent(Student e){  
	    template.save(e);  
	}  
	//method to update employee  
	public void updateStudent(Student e){  
	    template.update(e);  
	}  
	//method to delete employee  
	public void deleteStudent(Student e){  
	    template.delete(e);  
	}  
	//method to return one employee of given id  
	public Student getById(int id){  
	    Student e=(Student)template.get(Student.class,id);  
	    return e;  
	}  
	//method to return all employees  
	public List<Student> getStudents(){  
	    List<Student> list=new ArrayList<Student>();  
	    list=template.loadAll(Student.class);  
	    return list;  
	}
}
