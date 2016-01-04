package com.tsa.puridiom.jms;

import java.util.List;

import org.apache.camel.CamelContext;
import org.apache.camel.spring.Main;
import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class CamelRun {

	/**
	 * @author Zach Bricker
	 */
	public static void main(String[] args) {

		final String appContexts[] = {
//				"classpath*:META-INF/spring/auth-context.xml",
//				"classpath*:META-INF/spring/process-context.xml",
//				"classpath*:META-INF/spring/cd-context.xml",
//				"classpath*:META-INF/spring/tb-context.xml",
				"classpath*:META-INF/spring/rq-context.xml"
//				"classpath*:META-INF/spring/mr-context.xml",
//				"classpath*:META-INF/spring/po-context.xml",
//				"classpath*:META-INF/spring/rc-context.xml",
				//"classpath*:META-INF/spring/iv-context.xml",
				//"classpath*:META-INF/spring/in-context.xml",
//				"classpath*:META-INF/spring/pg-context.xml",
//				"classpath*:META-INF/spring/admin-context.xml",
//				"classpath*:META-INF/spring/br-context.xml",
//				"classpath*:META-INF/spring/vr-context.xml",
//				"classpath*:META-INF/spring/user-context.xml"
		};

		ClassPathXmlApplicationContext parentContext = new ClassPathXmlApplicationContext("/META-INF/spring/ms-context.xml");

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(appContexts, parentContext);

		Main main = new Main();
		main.setApplicationContext(context);

		List<CamelContext> contextList = main.getCamelContexts();
		for (int i = 0; i < contextList.size(); i++) {
			CamelContext ctx = (CamelContext) contextList.get(i);
			System.out.println(ctx);
			System.out.println(ctx.getName());
		}

		try {
//			 main.run() ;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
