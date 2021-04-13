package SpringJDBC;

import javax.persistence.*;

@Table
@Entity
public class Student {
	String sname;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int sid;
	String sadd;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSadd() {
		return sadd;
	}
	public void setSadd(String sadd) {
		this.sadd = sadd;
	}
	
}
