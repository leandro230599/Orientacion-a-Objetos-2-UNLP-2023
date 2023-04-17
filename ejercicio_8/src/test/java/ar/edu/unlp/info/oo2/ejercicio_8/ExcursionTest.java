/**
 * 
 */
package ar.edu.unlp.info.oo2.ejercicio_8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExcursionTest {
	
	Excursion excursion;
	Usuario user1;
	Usuario user2;
	Usuario user3;
	Usuario user4;
	
	@BeforeEach
	void setUp() throws Exception {
		excursion = new Excursion(
							"Dos dias en Kayak bajando el Parana",
							LocalDate.now(), 
							LocalDate.now(),
							"Rotonda alpargatas",
							1000,
							2,
							3);
		user1 = new Usuario("Hector","Lopez","hector@gmail.com");
		user2 = new Usuario("Delicia","Meza","delicia@gmail.com");
		user3 = new Usuario("Micaela","Lopez","micalula@gmail.com");
		user4 = new Usuario("Leandro","Lopez","leandro@gmail.com");
	}
    @Test
    public void testInscripcion() {
    	System.out.println(this.excursion.obtenerInformacion());
        this.excursion.inscribir(user1);
    	System.out.println(this.excursion.obtenerInformacion());
        this.excursion.inscribir(user2);
    	System.out.println(this.excursion.obtenerInformacion());
        this.excursion.inscribir(user3);
    	System.out.println(this.excursion.obtenerInformacion());
        this.excursion.inscribir(user4);
        assertEquals(3,this.excursion.getInscriptos().size());
        assertEquals(1,this.excursion.getListaEspera().size());
        
    }
}
