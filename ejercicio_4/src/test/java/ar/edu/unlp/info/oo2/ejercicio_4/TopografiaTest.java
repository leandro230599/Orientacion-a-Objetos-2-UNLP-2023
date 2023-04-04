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
	
	Topografia topografiaC = new Topografia();
	Topografia topografiaD = new Topografia();
	
	@BeforeEach
	void setUp() throws Exception {
		Mixto mixtoC = new Mixto();
		Simple simple1C = new Simple();
		Simple simple2C = new Simple();
		Simple simple3C = new Simple();
		Simple simple4C = new Simple();
	    simple1C.setTerreno(new Agua());
		simple2C.setTerreno(new Tierra());
		simple3C.setTerreno(new Agua());
		simple4C.setTerreno(new Tierra());
		mixtoC.add(simple1C, simple2C, simple3C, simple4C);
		topografiaC.agregarTopografia(mixtoC);
		
		
    	Mixto mixtoD = new Mixto();
    	Mixto mixto2D = new Mixto();
    	Simple simple1D = new Simple();
    	Simple simple2D = new Simple();
    	Simple simple3D = new Simple();
    	Simple simple4D = new Simple();
    	Simple simple5D = new Simple();
    	Simple simple6D = new Simple();
    	Simple simple7D = new Simple();
	    simple1D.setTerreno(new Agua());
		simple2D.setTerreno(new Tierra());
		simple3D.setTerreno(new Tierra());
		// Estos de abajo son del segundo mixto dentro del otro
		simple4D.setTerreno(new Agua());
		simple5D.setTerreno(new Tierra());
		simple6D.setTerreno(new Tierra());
		simple7D.setTerreno(new Agua());
		mixto2D.add(simple4D, simple5D, simple6D, simple7D);
		mixtoD.add(simple1D, simple2D, simple3D, mixto2D);
		topografiaD.agregarTopografia(mixtoD);
	}
    @Test
    public void testCasoCProporcionAgua() {
    	assertEquals(0.5, topografiaC.getProporcionAgua());
        
    }
    
    @Test
    public void testCasoDProporcionAgua() {
    	assertEquals(0.375, topografiaD.getProporcionAgua());
    }
    
    @Test
    public void testEquals() {
    	Topografia t1 = new Topografia();
    	Mixto m = new Mixto();
    	Mixto m2 = new Mixto();
    	Simple s1 = new Simple();
    	Simple s2 = new Simple();
    	Simple s3 = new Simple();
    	Simple s4 = new Simple();
    	Simple s5 = new Simple();
    	Simple s6 = new Simple();
    	Simple s7 = new Simple();
    	s1.setTerreno(new Tierra());
    	s2.setTerreno(new Tierra());
    	s3.setTerreno(new Agua());
    	s4.setTerreno(new Agua());
    	s5.setTerreno(new Agua());
    	s6.setTerreno(new Tierra()); // Modificar Tierra por Agua para probar assertTrue
    	s7.setTerreno(new Tierra());
    	m2.add(s5, s6, s7, s4);
    	m.add(s1, s2, m2, s3);
    	t1.agregarTopografia(m);
    	assertFalse(t1.equals(topografiaD));
    }
}
