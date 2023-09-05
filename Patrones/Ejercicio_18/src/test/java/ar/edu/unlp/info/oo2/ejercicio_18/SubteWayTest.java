/**
 * 
 */
package ar.edu.unlp.info.oo2.ejercicio_18;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo2.ejercicio_18.BuilderSandwich;
import ar.edu.unlp.info.oo2.ejercicio_18.Sandwich;
import ar.edu.unlp.info.oo2.ejercicio_18.SubteWay;

public class SubteWayTest {
	
	BuilderSandwich builder;
	SubteWay director;
	Sandwich sandwich;
	
	@BeforeEach
	void setUp() throws Exception {
		this.builder = new BuilderSandwich();
		this.director = new SubteWay(builder);
	}
    @Test
    public void testPrecioClasico() {
    	this.director.armarClasico();
    	sandwich = this.builder.getResult();
        assertEquals(500, sandwich.calcularPrecio());
    }
    @Test
    public void testPrecioVegetariano() {
    	this.director.armarVegetariano();
    	sandwich = this.builder.getResult();
        assertEquals(420, sandwich.calcularPrecio());
    }
    @Test
    public void testPrecioVegano() {
    	this.director.armarVegano();
    	sandwich = this.builder.getResult();
        assertEquals(620, sandwich.calcularPrecio());
    }
    @Test
    public void testPrecioSinTACC() {
    	this.director.armarSinTACC();
    	sandwich = this.builder.getResult();
        assertEquals(618, sandwich.calcularPrecio());
    }
}
