package SpringJDBC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {
	
	@Bean
	@Scope("prototype")
	public Student s() {
		Student st = new Student();
		st.setSid(0);
		st.setSadd(" ");
		st.setSname(" ");
		return st;
	}
	
}
