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
			System.out.println("ERROR, YA EXISTE "+screenName);
		else {
			this.users.add(new Usuario(screenName));
		}
	}
	
	public List<Usuario> getUsers(){
		return this.users;
	}
	
	public Usuario getUser(String screenName) {
		Optional<Usuario> user = this.getUsers().stream()
												.filter(x -> x.getScreenName() == screenName)
												.findFirst();
		return user.isPresent() ? user.get() : new Usuario("NO EXISTE");
	}
}
