package ar.edu.unlp.info.oo2.ejercicio_4;

import java.util.List;
import java.util.ArrayList;


public class Mixto extends Topografia {
	
	List<Topografia> children;
	
	public Mixto () {
		children = new ArrayList<Topografia>();
	}
	
	public void add (Topografia child1, Topografia child2, Topografia child3, Topografia child4) {
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

	@Override
	public boolean equals(Topografia t) {
		// TODO Auto-generated method stub
		return false;
	}

}
