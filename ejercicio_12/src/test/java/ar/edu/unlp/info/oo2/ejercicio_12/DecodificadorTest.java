/**
 * 
 */
package ar.edu.unlp.info.oo2.ejercicio_12;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DecodificadorTest {
	
	Decodificador decodificador;
	List<Pelicula> grilla;
	List<Pelicula> reproducidas;
	Pelicula p1;
	Pelicula p2;
	Pelicula p3;
	Pelicula p4;
	Pelicula p5;
	Pelicula p6;
	
	@BeforeEach
	void setUp() throws Exception {
		p1 = new Pelicula("Thor", 2007, 7.9);
		p2 = new Pelicula("Capitan America", 2016, 7.8);
		p3 = new Pelicula("Iron Man", 2010, 7.9);
		p4 = new Pelicula("Dunkirk", 2017, 7.9);
		p5 = new Pelicula("Rocky", 1976, 8.1);
		p6 = new Pelicula("Rambo", 1979, 7.8);
		grilla = new ArrayList<Pelicula>();
		reproducidas = new ArrayList<Pelicula>();
		
		p1.añadirSimilar(p2);
		//p1.añadirSimilar(p3);
		//p2.añadirSimilar(p1);
		p2.añadirSimilar(p3);
		p3.añadirSimilar(p1);
		//p3.añadirSimilar(p2);
		//p5.añadirSimilar(p6);
		p6.añadirSimilar(p5);
		
		grilla.add(p1);
		grilla.add(p2);
		grilla.add(p3);
		grilla.add(p4);
		grilla.add(p5);
		grilla.add(p6);
		
		reproducidas.add(p1);
		reproducidas.add(p5);
		
		decodificador = new Decodificador(grilla, reproducidas);
		
	}
    @Test
    public void testGetGrilla() {
        assertEquals(6, decodificador.getGrilla().size());
        
    }
    @Test
    public void testGetReproducidas() {
        assertEquals(2, decodificador.getReproducidas().size());
        
    }
    
    @Test
    public void testGetSimilares() {
    	//p1.getSimilares().forEach(p -> System.out.println(p.getTitulo()));
        assertEquals(2, p1.getSimilares().size());
    }
    
    @Test
    public void testSugerenciaNovedad() {
    	//decodificador.getSugerencia().forEach(p -> System.out.println(p.getTitulo()));
        assertEquals("Dunkirk", decodificador.getSugerencia().get(0).getTitulo());
        assertEquals("Capitan America", decodificador.getSugerencia().get(1).getTitulo());
        assertEquals("Iron Man", decodificador.getSugerencia().get(2).getTitulo());
    }
    
    @Test
    public void testSugerenciaSimilaridad() {
    	decodificador.changeStrategy(new Similaridad());
    	//decodificador.getSugerencia().forEach(p -> System.out.println(p.getTitulo()));
        assertEquals("Capitan America", decodificador.getSugerencia().get(0).getTitulo());
        assertEquals("Iron Man", decodificador.getSugerencia().get(1).getTitulo());
        assertEquals("Rambo", decodificador.getSugerencia().get(2).getTitulo());
    }
    
    @Test
    public void testSugerenciaPuntaje() {
    	decodificador.changeStrategy(new Puntaje());
    	//decodificador.getSugerencia().forEach(p -> System.out.println(p.getTitulo()));
        assertEquals("Dunkirk", decodificador.getSugerencia().get(0).getTitulo());
        assertEquals("Iron Man", decodificador.getSugerencia().get(1).getTitulo());
        assertEquals("Capitan America", decodificador.getSugerencia().get(2).getTitulo());
    }
}
