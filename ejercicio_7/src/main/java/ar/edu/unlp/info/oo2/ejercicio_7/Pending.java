package ar.edu.unlp.info.oo2.ejercicio_7;

import java.time.LocalTime;

public class Pending extends State{

	public void start (ToDoItem todoitem) {
		todoitem.setStart(LocalTime.now());
		todoitem.changeState(new InProgress());
	}
	
	public void togglePause(ToDoItem todoitem) {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress, se encuentra en Pending");
	}

}
