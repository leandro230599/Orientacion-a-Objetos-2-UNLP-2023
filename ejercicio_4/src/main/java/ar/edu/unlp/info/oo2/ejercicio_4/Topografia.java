package ar.edu.unlp.info.oo2.ejercicio_4;

import java.util.List;
import java.util.ArrayList;


public abstract class Topografia {
	
	
	abstract public Double getProporcionAgua() ;
	abstract public Double getProporcionTierra() ;
	abstract public boolean comparar(Topografia t) ;
	
	public boolean compararConAgua() {
		return false;
	}
	public boolean compararConTierra() {
		return false;
	}
	public boolean compararConMixto(Mixto mixto) {
		return false;
	}

	@Override
	public boolean equals(Object object) {
		if (object == null) {
			return false;
		}
		if (object == this) {
			return true;
		}
		if (object instanceof Topografia) {
			return this.comparar((Topografia) object);
		}
		return false;
	}
	
	public boolean compararConSimple(Simple t) {
		return false;
	}

}
