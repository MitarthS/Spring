package SpringJDBC;
import org.springframework.jdbc.core.JdbcTemplate;  


public class StudentDAO {
	private JdbcTemplate jdbcTemplate;  
	  
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	}  
	  
	public int saveEmployee(Student e){  
	    String query="insert into student values('"+e.getSid()+"','"+e.getSname()+"','"+e.getSadd()+"')";  
	    return jdbcTemplate.update(query);  
	}  
	public int updateEmployee(Student e){  
	    String query="update student set name='"+e.getSname()+"',Add='"+e.getSadd()+"' where id='"+e.getSid()+"' ";  
	    return jdbcTemplate.update(query);  
	}  
	public int deleteEmployee(Student e){  
	    String query="delete from student where id='"+e.getSid()+"' ";  
	    return jdbcTemplate.update(query);  
	}  
}
