package ar.edu.unlp.info.oo2.ejercicio_1;

import java.util.List;

public class Usuario {

	private String screenName;
	private List<Tweet> tweets;
	
	public Usuario (String screenName) {
		this.screenName = screenName;
		
	}
	
	public String getScreenName() {
		return this.screenName;
	}
}
