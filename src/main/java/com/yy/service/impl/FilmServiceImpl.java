package com.yy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.yy.mapper.FilmMapper;
import com.yy.po.Film;
import com.yy.service.FilmService;

public class FilmServiceImpl implements FilmService{

	@Autowired
	private FilmMapper filmMaper;
	
	
	public void insertFilm(Film film) {
		try {
			filmMaper.insertFilm(film);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
 
}
