/**
 * 
 */
package ar.edu.unlp.info.oo2.ejercicio_9;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EncriptadorTest {
	
	Mensajero mensajero;
	Mensajero mensajero2;
	Mensajero mensajero3;
	
	@BeforeEach
	void setUp() throws Exception {
		mensajero = new Mensajero();
		mensajero2 = new Mensajero();
		mensajero3 = new Mensajero();
		
	}
    @Test
    public void testEnvio() {
        mensajero.enviar("Hola que tal estas?");
        
    }
}
