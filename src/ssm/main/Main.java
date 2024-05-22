package ssm.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ssm.POJO.Student;

public class Main {

	public static void main(String[] args) {
		String config_loc = "/ssm/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
		
		Student std = (Student)context.getBean("stdId");
		std.display();
		
		if (context != null) {
            ((ClassPathXmlApplicationContext) context).close();
        }
	}

}
