import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author: 邮箱：wb-zfp743816@alibaba-inc.com
 * @create: 2020年10月10日 10:28
 */
public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/spring.xml");
		HelloService service = context.getBean(HelloService.class);
		service.sayHello("zfp");

//		FileSystemXmlApplicationContext context1 = new FileSystemXmlApplicationContext("spring.xml");
//		HelloService service = context1.getBean(HelloService.class);
//		service.sayHello("zfp");
	}
}
