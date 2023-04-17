package ar.edu.unlp.info.oo2.ejercicio_7;

public abstract class State {
    public void start(ToDoItem todoitem) {}
	abstract public void togglePause(ToDoItem todoitem);
	public void finish(ToDoItem todoitem) {}
}
