package gena.spring.demo;

import gena.spring.demo.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		MyController myControllerR = (MyController) ctx.getBean("myController");
		String greeting = myControllerR.sayHello();
		System.out.println(greeting);
	}

}
