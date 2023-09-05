package ar.edu.unlp.info.oo2.ejercicio_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Twitter {
	
	private List<Usuario> users;
	
	public Twitter() {
		this.users = new ArrayList<Usuario>();
	}
	
	public void addUser (String screenName) {
		boolean existe = this.users.stream().anyMatch(x -> x.getScreenName() == screenName);
		if (existe) 
			throw new IllegalArgumentException("El usuario "+screenName+" ya existe, ingrese un screenName nuevo");
		else {
			this.users.add(new Usuario(screenName));
		}
	}
	
	public List<Usuario> getUsers(){
		return this.users;
	}
	
	public Usuario getUser(String screenName) {
		Usuario user = this.getUsers().stream()
												.filter(x -> x.getScreenName() == screenName)
												.findFirst()
												.orElse(null);
		if (user == null) {
			throw new IllegalArgumentException("El usuario "+screenName+" no existe");
		}
		return user;
	}
	
	public void deleteUser (String screenName) {
		Usuario userDelete = this.getUser(screenName);
		userDelete.deleteTweets();
		System.out.println(this.users.remove(userDelete));
	}
}
