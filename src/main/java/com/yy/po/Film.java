package com.yy.po;

public class Film {
//id	
private int	film_id;
//标题
private	String title;
//描述
private	String description;
//语言id
private	int language_id;

public int getFilm_id() {
	return film_id;
}

public void setFilm_id(int film_id) {
	this.film_id = film_id;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public int getLanguage_id() {
	return language_id;
}

public void setLanguage_id(int language_id) {
	this.language_id = language_id;
}


}
