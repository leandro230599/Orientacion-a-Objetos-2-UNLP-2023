package ar.edu.unlp.info.oo2.ejercicio_7;

import java.time.LocalTime;

public class InProgress  extends State{
	
	public void togglePause(ToDoItem todoitem) {
		todoitem.changeState(new Paused());
	}

}
