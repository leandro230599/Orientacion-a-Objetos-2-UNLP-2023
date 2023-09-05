package ar.edu.unlp.info.oo2.ejercicio_12;

import java.util.List;
import java.util.ArrayList;

public class Decodificador {
	
	private List<Pelicula> grilla;
	private List<Pelicula> reproducidas;
	private Criterio criterio;
	
	public Decodificador (List<Pelicula> grilla, List<Pelicula> reproducidas) {
		this.grilla = grilla;
		this.reproducidas = reproducidas;
		this.criterio = new Novedad();
	}
	
	public List<Pelicula> getGrilla() {
		return grilla;
	}
	public List<Pelicula> getReproducidas() {
		return reproducidas;
	}
	
	public List<Pelicula> getSugerencia(){
		return this.criterio.getSugerencia(this);
	}
	
	public void changeStrategy(Criterio criterio) {
		this.criterio = criterio;
	}
}
