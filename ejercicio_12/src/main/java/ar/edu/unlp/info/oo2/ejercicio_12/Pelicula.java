package ar.edu.unlp.info.oo2.ejercicio_12;

import java.util.List;
import java.util.ArrayList;

public class Pelicula {
	
	private String titulo;
	private int ano;
	private List<Pelicula> similares;
	private double puntaje;
	
	
	public Pelicula (String titulo, int ano, double puntaje) {
		this.titulo = titulo;
		this.ano = ano;
		this.similares = new ArrayList<Pelicula>();
		this.puntaje = puntaje;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public int getAno() {
		return ano;
	}

	public List<Pelicula> getSimilares() {
		return similares;
	}

	public double getPuntaje() {
		return puntaje;
	}

	public void añadirSimilar(Pelicula pelicula) {
		if (!this.similares.contains(pelicula)) {
			this.similares.add(pelicula);
			pelicula.añadirSimilar(this);
		}
	}
}
