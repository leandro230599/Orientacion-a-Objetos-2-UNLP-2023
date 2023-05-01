/**
 * 
 */
package ar.edu.unlp.info.oo2.ejercicio_14;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileManagerTest {
	
	Component archivo;
	
	@BeforeEach
	void setUp() throws Exception {
		this.archivo = new FileOO2("imagen1",".png",255, "23/05/1999", "01/05/2023", "ninguno");
	}
    @Test
    public void testPruebaCasoUno() {
    	
    	// El caso uno deberia devolver "nombre - extension"
    	Component extension = new DecoratorExtencion(archivo);
    	Component nombre = new DecoratorNombre(extension);
        assertEquals("imagen1 - .png", nombre.prettyPrint());     
    }
    
    @Test
    public void testPruebaCasoDos() {
    	
    	// El caso dos deberia devolver "nombre - extension - fecha de creacion"
    	Component fecha_creacion = new DecoratorFechaCreacion(archivo);
    	Component extension = new DecoratorExtencion(fecha_creacion);
    	Component nombre = new DecoratorNombre(extension);
        assertEquals("imagen1 - .png - 23/05/1999", nombre.prettyPrint());     
    }
    
    @Test
    public void testPruebaCasoTres() {
    	
    	// El caso tres deberia devolver "permisos - nombre - extensión - tamaño"
    	Component tamano = new DecoratorTamano(archivo);
    	Component extencion = new DecoratorExtencion(tamano);
    	Component nombre = new DecoratorNombre(extencion);
    	Component permisos = new DecoratorPermisos(nombre);
        assertEquals("ninguno - imagen1 - .png - 255", permisos.prettyPrint());     
    }
}
