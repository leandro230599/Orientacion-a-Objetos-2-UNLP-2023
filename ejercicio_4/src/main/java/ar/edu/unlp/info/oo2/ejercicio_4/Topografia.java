package ar.edu.unlp.info.oo2.ejercicio_4;

import java.util.List;
import java.util.ArrayList;


public class Topografia {
	Tipo topografias;
	
	
	public void agregarTopografia(Tipo topografia) {
		this.topografias = topografia;
	}
	
	public Double getProporcionAgua() {
		return this.topografias.getProporcionAgua();
	}

	public Double getProporcionTierra() {
		return this.topografias.getProporcionTierra();
	}
	
	public boolean equals(Topografia t) {
		if ((t.getProporcionAgua().equals(this.topografias.getProporcionAgua())) && 
		   (t.getProporcionTierra().equals(this.topografias.getProporcionTierra()))){
			return true;
		}
		return false;
	}

}
