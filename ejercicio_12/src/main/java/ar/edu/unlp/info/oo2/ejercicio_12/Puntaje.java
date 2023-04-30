package ar.edu.unlp.info.oo2.ejercicio_12;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Puntaje extends Criterio{

	@Override
	protected List<Pelicula> sugerir(List<Pelicula> peliculas, List<Pelicula> reproducidas) {
		return peliculas.stream().sorted(Comparator.comparing(Pelicula::getPuntaje).thenComparing(Pelicula::getAno).reversed()).limit(3).collect(Collectors.toList());
	}

}
