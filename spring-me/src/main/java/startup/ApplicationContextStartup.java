package startup;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextStartup {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/spring.xml");
		HelloService service = context.getBean(HelloService.class);
		service.sayHello("zfp");

//		FileSystemXmlApplicationContext context1 = new FileSystemXmlApplicationContext("spring.xml");
//		startup.HelloService service = context1.getBean(startup.HelloService.class);
//		service.sayHello("zfp");
	}
}
