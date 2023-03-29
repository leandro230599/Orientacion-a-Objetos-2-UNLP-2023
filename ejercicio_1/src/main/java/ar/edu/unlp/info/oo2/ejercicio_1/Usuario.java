package ar.edu.unlp.info.oo2.ejercicio_1;

import java.util.List;

public class Usuario {

	private String screenName;
	private List<Tweet> tweets;
	
	public Usuario (String screenName) {
		this.screenName = screenName;
		this.tweets = null;
		
	}
	
	public String getScreenName() {
		return this.screenName;
	}
	
	public List<Tweet> getTweets(){
		return this.tweets;
	}
	
	public void twittear(String text) {
	}
}
