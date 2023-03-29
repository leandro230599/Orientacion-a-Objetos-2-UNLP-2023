package ar.edu.unlp.info.oo2.ejercicio_1;

public class ReTweet extends Tweet{
	private Usuario origen;
	
	public ReTweet (String text, Usuario user) {
		super(text);
		this.setOrigen(user);
	}
	
	public Usuario getOrigen() {
		return origen;
	}

	public void setOrigen(Usuario origen) {
		this.origen = origen;
	}

	
	
}
