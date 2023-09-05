/**
 * 
 */
package ar.edu.unlp.info.oo2.ejercicio_6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadosTest {
	
	Pasante pasante;
	Planta planta;
	Temporario temporario;
	
	@BeforeEach
	void setUp() throws Exception {
		temporario = new Temporario(5,true,3,6,4);
		planta = new Planta(3,false,1,3,2);
		pasante = new Pasante(10,false,0,2,7);
	}
    @Test
    public void testSaldoTemporario() {
        assertEquals(29155, this.temporario.sueldo());   
    }
    
    @Test
    public void testSaldoPasante() {
        assertEquals(30700, this.pasante.sueldo());   
    }
    
    @Test
    public void testSaldoPlanta() {
        assertEquals(51100, this.planta.sueldo());   
    }
    
    
}
