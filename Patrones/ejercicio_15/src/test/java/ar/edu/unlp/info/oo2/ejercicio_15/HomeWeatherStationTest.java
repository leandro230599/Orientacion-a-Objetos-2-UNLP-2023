package ar.edu.unlp.info.oo2.ejercicio_15;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HomeWeatherStationTest {
	
	Component estacion;
	List<Double> list;
	
	@BeforeEach
	void setUp() throws Exception {
		list = new ArrayList<>(Arrays.asList(104.0, 95.0, 68.0));
		this.estacion = new Estacion_Meteorologica(68, 1008, 500, list);
	}
    @Test
    public void testPruebaCasoUno() {
    	
    	// El caso uno deberia devolver "Presion atmosferica: X"
    	Component presion = new DecoratorPresion(estacion);
        assertEquals("Presion atmosferica: 1008", presion.displayData());     
    }
    
    @Test
    public void testPruebaCasoDos() {
    	
    	// El caso dos deberia devolver "Presion atmosferica: X  Radiacion solar: Y"
    	Component radiacion = new DecoratorRadiacionSolar(estacion);
    	Component presion = new DecoratorPresion(radiacion);
        assertEquals("Presion atmosferica: 1008 Radiacion solar: 500", presion.displayData());     
    }
    
    @Test
    public void testPruebaCasoTres() {
    	
    	// El caso tres deberia devolver "Radiación solar: X Temperatura C°: Y Promedio de temperaturas en F°: Z"
    	Component promedio = new DecoratorPromedioHistorico(estacion);
    	Component celcius = new DecoratorTemperaturaCelcius(promedio);
    	Component radiacion = new DecoratorRadiacionSolar(celcius);
        assertEquals("Radiacion solar: 500 Temperatura C°: 20 Promedio de temperaturas en F°: 89", radiacion.displayData());     
    }
}
