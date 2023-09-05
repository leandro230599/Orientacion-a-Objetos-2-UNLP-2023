package ar.edu.unlp.info.oo2.ejercicio_1;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private String screenName;
	private List<Tweet> tweets;
	
	public Usuario (String screenName) {
		this.screenName = screenName;
		this.tweets = new ArrayList<Tweet>();
		
	}
	
	public String getScreenName() {
		return this.screenName;
	}
	
	
	public List<Tweet> getTweets(){
		return this.tweets;
	}
	
	public Tweet twittear(String text) {
		if ((text == null) || (text.length() < 1) || (text.length() > 280)) {
			throw new IllegalArgumentException("El tweet debe contener entre 1 y 280 caracteres");
		}
		Tweet tweet = new Tweet(text,this);
		tweets.add(tweet);
		return tweet;
	}
	
	public Tweet retwittear(Tweet tweet) {
		ReTweet retweet = new ReTweet(tweet.getText(), tweet);
		tweets.add(retweet);
		return retweet;
	}
	
	public void deleteTweets() {
		tweets = null;
	}
}
