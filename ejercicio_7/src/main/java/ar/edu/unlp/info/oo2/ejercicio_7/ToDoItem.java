package ar.edu.unlp.info.oo2.ejercicio_7;

import java.time.LocalTime;
import java.util.List;
import java.util.ArrayList;
import java.time.Duration;

public class ToDoItem {
	
	private State state;
	private String name;
	private LocalTime start;
	private LocalTime end;
	private List<String> comments;
	
/**
* Instancia un ToDoItem nuevo en estado pending con <name> como nombre.
*/
        public ToDoItem(String name) {
        	this.name = name;
        	this.state = new Pending();
        	this.comments = new ArrayList<String>();
        }

   	/**
* Pasa el ToDoItem a in-progress, siempre y cuando su estado actual sea
* pending. Si se encuentra en otro estado, no hace nada.
*/
        public void start() {
        	this.state.start(this);
        }

	/**
* Pasa el ToDoItem a paused si su estado es in-progress, o a in-progress si su
* estado es paused. Caso contrario (pending o finished) genera un error
* informando la causa específica del mismo.
*/
        public void togglePause() {
        	this.state.togglePause(this);
        }


	/**
* Pasa el ToDoItem a finished, siempre y cuando su estado actual sea 
* in-progress o paused. Si se encuentra en otro estado, no hace nada.
*/
        public void finish() {
        	this.state.finish(this);
        }


	/**
* Retorna el tiempo que transcurrió desde que se inició el ToDoItem (start)
* hasta que se finalizó. En caso de que no esté finalizado, el tiempo que
* haya transcurrido hasta el momento actual. Si el ToDoItem no se inició,
* genera un error informando la causa específica del mismo.
*/
        public Duration workedTime() {
        	LocalTime d;
        	if (this.getStart() == null) {
        		throw new RuntimeException("El objeto ToDoItem no se encuentra iniciado");
        	} else 
        		if (this.getEnd() == null) {
        			d = LocalTime.now();
        		}
        		else {
        			d = this.getEnd();
        		}
        	return Duration.between(this.getStart(), d);
        }


/**
* Agrega un comentario al ToDoItem siempre y cuando no haya finalizado. Caso
* contrario no hace nada."
*/
        public void addComment(String comment) {
        	if (!this.state.getClass().getSimpleName().equals("Finished")){
        		this.comments.add(comment);    		
        	}
        }
        
        public void changeState (State state) {
        	this.state = state;
        }
        
        public State getState() {
        	return this.state;
        }
        
        public LocalTime getStart() {
        	return this.start;
        }
        
        public LocalTime getEnd() {
        	return this.end;
        }
        
        public void setStart(LocalTime start) {
        	this.start = start;
        }
        
        public void setEnd(LocalTime end) {
        	this.end = end;
        }
        
        public String getName() {
        	return this.name;
        }
        
        public List<String> getComments(){
        	return this.comments;
        }
}

