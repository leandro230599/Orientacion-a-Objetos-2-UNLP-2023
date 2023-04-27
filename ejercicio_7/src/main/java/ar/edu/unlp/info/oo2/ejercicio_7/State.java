package ar.edu.unlp.info.oo2.ejercicio_7;

import java.time.LocalTime;

public abstract class State {
    public void start(ToDoItem todoitem) {}
	abstract public void togglePause(ToDoItem todoitem);
	public void finish(ToDoItem todoitem) {
		todoitem.setEnd(LocalTime.now());
		todoitem.changeState(new Finished());
	}
}
