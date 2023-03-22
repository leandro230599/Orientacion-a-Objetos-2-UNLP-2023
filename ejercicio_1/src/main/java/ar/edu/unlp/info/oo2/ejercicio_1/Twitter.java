package ar.edu.unlp.info.oo2.ejercicio_1;

import java.util.ArrayList;
import java.util.List;

public class Twitter {
	
	private List<Usuario> users;
	
	public Twitter() {
		this.users = new ArrayList<Usuario>();
	}
	
	public void addUser (String screenName) {
		// ACA
		boolean existe = this.users.stream().anyMatch(x -> x.getScreenName() == screenName);
		if (existe) 
			System.out.println("ERROR, YA EXISTE "+screenName);
		else
			this.users.add(new Usuario(screenName));
	}
	
	public List<Usuario> getUsers(){
		return this.users;
	}
}
