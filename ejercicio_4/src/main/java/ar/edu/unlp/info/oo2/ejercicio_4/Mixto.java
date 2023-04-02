package ar.edu.unlp.info.oo2.ejercicio_4;

import java.util.List;
import java.util.ArrayList;


public class Mixto implements Tipo {
	
	List<Tipo> children;
	
	public Mixto () {
		children = new ArrayList<Tipo>();
	}
	
	public void add (Tipo child1, Tipo child2, Tipo child3, Tipo child4) {
		this.children.add(child1);
		this.children.add(child2);
		this.children.add(child3);
		this.children.add(child4);
	}
	
	
	public Double getProporcionTierra() {
		return (this.children.stream().mapToDouble(child -> child.getProporcionTierra()).sum()) / 4;
	}
	
	public Double getProporcionAgua() {
		return (this.children.stream().mapToDouble(child -> child.getProporcionAgua()).sum()) / 4;
	}

}
