package com.yy.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


@Aspect
public class FilmAop {

	@Before(value="execution(* com.yy.mapper.FilmMapper.*(..))")
	public void beforeInsertFilm(){
		
		System.out.println("Before Insert Film Data ");
	}
	
	@After(value="execution(* com.yy.mapper.FilmMapper.*(..))")
	public void AfterInsertFile(){
		System.out.println("After Insert Film Data ");
		
	}
}
