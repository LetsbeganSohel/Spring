package Spring2.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
		ConstractorUtil Cu = (ConstractorUtil) context.getBean("Emp");
		System.out.println(Cu);
	}
}
