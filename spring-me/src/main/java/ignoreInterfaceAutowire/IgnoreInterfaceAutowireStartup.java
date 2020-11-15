package ignoreInterfaceAutowire;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class IgnoreInterfaceAutowireStartup {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		factory.ignoreDependencyInterface(Holder.class);
		new XmlBeanDefinitionReader(factory).loadBeanDefinitions("/spring-ignore-interface-autowire.xml");
		Holder holder = factory.getBean(Holder.class);
		System.out.println(holder.getSubject() == null);
	}
}
