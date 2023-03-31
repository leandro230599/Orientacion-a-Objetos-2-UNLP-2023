package ar.edu.unlp.info.oo2.ejercicio_1;

public class Tweet {
	private String text;
	private Usuario user;
	
	public Tweet(String text, Usuario user) {
		this.setText(text);
		this.user = user;
	}
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	
	public Usuario getUser() {
		return this.user;
	}

}
