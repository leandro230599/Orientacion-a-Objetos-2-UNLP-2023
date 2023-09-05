/**
 * 
 */
package ar.edu.unlp.info.oo2.ejercicio_4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TopografiaTest {
	
	private Agua agua;
	private Tierra tierra;
	private Pantano pantano;
	private Mixto mixto;
	
	@BeforeEach
	void setUp() throws Exception {

		agua = new Agua();
		tierra = new Tierra();
		pantano = new Pantano();
		mixto = new Mixto(new Agua(), new Tierra(), new Tierra(), new Tierra());
	}
	
    @Test
    public void testProporcionAgua() {
    	assertEquals(1, agua.getProporcionAgua());
    	assertEquals(0, tierra.getProporcionAgua());
        
    }
    
    @Test
    public void testEquals() {
    	assertTrue(agua.comparar(new Agua()));
    	assertFalse(agua.comparar(tierra));
    	assertFalse(agua.comparar(pantano));
    	assertFalse(agua.comparar(mixto));
    	
    	assertTrue(tierra.comparar(new Tierra()));
    	assertFalse(tierra.comparar(agua));
    	assertFalse(tierra.comparar(pantano));
    	assertFalse(tierra.comparar(mixto));
    	
    	assertTrue(mixto.comparar(new Mixto(new Agua(), new Tierra(), new Tierra(), new Tierra())));
    	assertFalse(mixto.comparar(agua));
    	assertFalse(mixto.comparar(pantano));
    	assertFalse(mixto.comparar(tierra));
    	assertFalse(mixto.comparar(new Mixto(new Tierra(), new Agua(), new Tierra(), new Tierra())));
    	assertFalse(mixto.comparar(new Mixto(new Tierra(), 
    			new Mixto(new Agua(), new Tierra(), new Tierra(), new Tierra()), 
    			new Tierra(), 
    			new Tierra())));
    	
    	assertTrue(agua.equals(new Agua()));
    	assertFalse(agua.equals(null));
    	assertFalse(agua.equals("hola"));
    	
    }
}