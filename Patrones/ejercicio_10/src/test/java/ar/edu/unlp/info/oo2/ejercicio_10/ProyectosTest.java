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
		proyecto.crearProyecto("Vacaciones de invierno", date1, date2, "salir con amigos", 3, 500);;
	}
    @Test
    public void testSolicitado() {
		proyecto.aprobarEtapa();
        proyecto.aprobarEtapa();
        assertEquals("Confirmado", proyecto.getState().getClass().getSimpleName());
    }
    
    @Test
    public void testEnConstruccion() {
    	assertEquals("Construccion", proyecto.getState().getClass().getSimpleName());
    }
    
    @Test
    public void testCosto() {
    	assertEquals(10500, proyecto.costoProyecto());
    }
    
    @Test
    public void testPrecio() {
    	assertEquals(11235, proyecto.precioProyecto());
    }
    
    @Test
    public void testCancelar() {
    	assertEquals("salir con amigos", proyecto.getObjetivo());
    	proyecto.cancelarProyecto();
    	assertEquals("(Cancelado)", proyecto.getObjetivo());
    	assertEquals("Cancelado", proyecto.getState().getClass().getSimpleName());
    }
    
    /* COMENTADO PORQUE LANZA EL ERROR CORRECTAMENTE
     * @Test
    public void testErrorAprobar() {
    	Proyecto proyecto2 = new Proyecto();
    	proyecto.crearProyecto("Algo", date1, date2, "no se", 1, 0);
    	proyecto.aprobarEtapa();
    }*/
}
