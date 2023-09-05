package ar.edu.unlp.info.oo2.ejercicio_19;

public class Personaje {
	private Armadura armadura;
	private Arma arma;
	private int vida;
	private String habilidad;
	private String nombre;
	
	public Personaje (String nombre,Armadura armadura, Arma arma, String habilidad) {
		this.nombre = nombre;
		this.armadura = armadura;
		this.arma = arma;
		this.habilidad = habilidad;
		this.vida = 100;
	}
	
	public boolean isAlive() {
		return this.vida > 0;
	}
	
	public int getSalud() {
		return this.vida;
	}
	
	public void atacar(Personaje enemigo) {
		if (this.isAlive()) {
			enemigo.recibirAtaque(this.arma);
		}
	}
	
	public void recibirAtaque(Arma arma) {
		if (this.isAlive()) {
			this.vida -= arma.getDañoInflingido(this.armadura);
		}
	}
}
