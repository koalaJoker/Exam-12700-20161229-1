package com.yy.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;

public class AplicationContextEvent implements ApplicationListener<ApplicationEvent>{

	public void onApplicationEvent(ApplicationEvent event) {
		//当ApplicationContext初始化触发
		  if(event instanceof ContextRefreshedEvent ){    
              System.out.println("Context Start"); 	
	}
		//当ApplicationContext关闭触发
		  if(event instanceof ContextClosedEvent){    
              System.out.println("Context Stop"); 
		
	}
}
}