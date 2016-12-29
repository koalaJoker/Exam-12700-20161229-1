package com.yy.main;

import java.util.Scanner;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yy.po.Film;
import com.yy.service.FilmService;

public class FilmEntrance {
	static Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
		AbstractApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:spring/ApplicationContext.xml");
		System.out.println("请输入电影名称(title):");
		String title=getTitle();
		System.out.println("请输入电影描述(description):");
		String description=getDescription();
		System.out.println("1.English 2.Italian 3.Japanese 4.Mandarin 5.French 6.German");
		System.out.println("请输入语言 ID(language_id)<请选择1-6>:");
		int id=-1;
		while((id=getLanguageId())==0){
			System.out.println("输入不正确，请重新输入：");
		}
		Film film =new Film();
		film.setTitle(title);
		film.setDescription(description);
		film.setLanguage_id(id);
		FilmService filmService= (FilmService) applicationContext.getBean("filmService");
		try {
			filmService.insertFilm(film);
		} catch (Exception e) {
			System.out.println(123);
		}
		applicationContext.close();
	}
	
//获得电影名称
	
	public static String getTitle(){
		String title=input.nextLine();
		if(!"".equals(title)&&title!=null){
			return title;
		}else{
		System.out.println("电影名称不能为空，请重新输入:");
		getTitle();
		}
		return "";
	}
	
//获得电影描述
	public static String getDescription(){
		String description=input.nextLine();
		if(!"".equals(description)&&description!=null){
			return description;
		}else{
		System.out.println("电影描述不能为空，请重新输入:");
		getDescription();
		}
		return "";
	}
	//获得语言id
	public static int getLanguageId(){
	  try {
		 Scanner s=new Scanner(System.in);
		int id=s.nextInt();
		if(id>=1&&id<=6){
			return id;
		}
	} catch (Exception e) {
		return 0;
		
	}
	  return 0;
}}
