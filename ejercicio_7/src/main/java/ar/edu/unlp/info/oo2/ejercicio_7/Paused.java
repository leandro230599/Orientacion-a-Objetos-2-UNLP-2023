package ar.edu.unlp.info.oo2.ejercicio_7;

import java.time.LocalTime;

public class Paused extends State {

	public void togglePause(ToDoItem todoitem) {
		todoitem.changeState(new InProgress());
	}
	
	public void finish(ToDoItem todoitem) {
		todoitem.setEnd(LocalTime.now());
		todoitem.changeState(new Finished());
	}

}
