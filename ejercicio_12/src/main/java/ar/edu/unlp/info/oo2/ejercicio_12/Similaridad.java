package ar.edu.unlp.info.oo2.ejercicio_12;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Similaridad extends Criterio{

	@Override
	protected List<Pelicula> sugerir(List<Pelicula> peliculas, List<Pelicula> reproducidas) {
		return peliculas.stream().filter(p -> reproducidas.stream().anyMatch(r -> r.getSimilares().contains(p))).limit(3).collect(Collectors.toList());
	}

}
