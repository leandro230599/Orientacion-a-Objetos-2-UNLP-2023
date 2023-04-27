package ar.edu.unlp.info.oo2.ejercicio_7;

import java.time.LocalTime;

public class Finished extends State {

	public void togglePause(ToDoItem todoitem) {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress, se encuentra en Finished");
	}
	
	public void finish(ToDoItem todoitem) {}

}
