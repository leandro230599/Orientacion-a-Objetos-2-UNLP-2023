package ar.edu.unlp.info.oo2.ejercicio_12;

import java.util.List;
import java.util.stream.Collectors;

public abstract class Criterio {
	
	public List<Pelicula> getSugerencia (Decodificador decodificador){
		List<Pelicula> noVistas = decodificador.getGrilla().stream().filter(p -> !decodificador.getReproducidas().contains(p)).collect(Collectors.toList());
		return this.sugerir(noVistas, decodificador.getReproducidas());
	}
	
	abstract protected List<Pelicula> sugerir (List<Pelicula> peliculas, List<Pelicula> reproducidas);
}
