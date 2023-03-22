/**
 * 
 */
package ar.edu.unlp.info.oo2.ejercicio_1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonaTest {
	
//	Persona james;
//	Persona guido;
	Twitter twitter;
	
	@BeforeEach
	void setUp() throws Exception {
//		james = new Persona("James", "Glossing");
//		guido = new Persona("Guido", "van Rossum");
		twitter = new Twitter();
		twitter.addUser("leandro");
		twitter.addUser("delicia");
		twitter.addUser("micaela");
		twitter.addUser("leandro");
		twitter.addUser("hector");
	}
    @Test
    public void testNombreCompleto() {
//        assertEquals("Glossing, James", james.getNombreCompleto());
//        assertEquals("van Rossum, Guido", guido.getNombreCompleto());
    	  assertEquals(twitter.getUsers().size(), 4);
        
    }
}
