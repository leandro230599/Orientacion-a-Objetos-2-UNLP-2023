/**
 * 
 */
package ar.edu.unlp.info.oo2.ejercicio_7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ToDoItemTest {
	
	ToDoItem todoitem;
	
	@BeforeEach
	void setUp() throws Exception {
		todoitem = new ToDoItem("Tarea sin iniciar");
	}
	
    @Test
    public void testgetNameToDo() {
    	assertEquals("Tarea sin iniciar", todoitem.getName());
    }
    
    @Test
    public void testWithoutState() {
    	assertEquals("Pending",todoitem.getState().getClass().getSimpleName());
    }
    
    @Test
    public void testStart() {
    	todoitem.start();
    	assertEquals("InProgress", todoitem.getState().getClass().getSimpleName());
    }
    
    @Test
    public void testWorkedTime() throws InterruptedException {
    	todoitem.start();
    	Thread.sleep(4000);
    	assertEquals(4,todoitem.workedTime().getSeconds());
    }
    
    @Test
    public void testRepeatStart() {
    	todoitem.start();
    	assertEquals("InProgress", todoitem.getState().getClass().getSimpleName());
    	todoitem.start();
    	assertEquals("InProgress", todoitem.getState().getClass().getSimpleName());
    }
    
    @Test
    public void testTogglePause() {
    	// todoitem.togglePause(); GENERA EL ERROR SOLICITADO EN ENUNCIADO, POR ESTAR PENDING
    	todoitem.start();
    	assertEquals("InProgress", todoitem.getState().getClass().getSimpleName());
    	todoitem.togglePause();
    	assertEquals("Paused", todoitem.getState().getClass().getSimpleName());
    	todoitem.togglePause();
    	assertEquals("InProgress", todoitem.getState().getClass().getSimpleName());
    }
    
    @Test
    public void testFinish() throws InterruptedException {
    	todoitem.finish();
    	assertEquals("Pending", todoitem.getState().getClass().getSimpleName());
    	todoitem.start();
    	Thread.sleep(5000);
    	todoitem.finish();
    	Thread.sleep(1000);
    	assertEquals(5,todoitem.workedTime().getSeconds());
    }
    
    @Test
    public void testAddComments() {
    	todoitem.addComment("HOLA");
    	todoitem.addComment("OTRO COMENTARIO");
    	todoitem.start();
    	todoitem.addComment("Algo mas");
    	todoitem.finish();
    	todoitem.addComment("No se agrega");
    	assertEquals(3,todoitem.getComments().size());
    }
}
