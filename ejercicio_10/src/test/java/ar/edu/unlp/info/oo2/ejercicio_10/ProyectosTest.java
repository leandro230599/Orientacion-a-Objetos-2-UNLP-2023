/**
 * 
 */
package ar.edu.unlp.info.oo2.ejercicio_10;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProyectosTest {
	
	Proyecto proyecto;
	LocalDate date1;
	LocalDate date2;
	
	@BeforeEach
	void setUp() throws Exception {
		proyecto = new Proyecto();
		date1 = LocalDate.of(2023, 4, 23);
		date2 = LocalDate.of(2023, 4, 30);
		proyecto.crearProyecto("Vacaciones de invierno", date1, date2, "salir con amigos", 3, 500);
		proyecto.aprobarEtapa();
	}
    @Test
    public void testSolicitado() {
        proyecto.aprobarEtapa();
        assertEquals("Confirmado", proyecto.getState().getClass().getSimpleName());
    }
}
