package ar.edu.unlp.info.oo2.ejercicio_4;

import java.util.List;
import java.util.ArrayList;


public class Mixto extends Topografia {
	
	List<Topografia> children;
	
	public Mixto (Topografia child1, Topografia child2, Topografia child3, Topografia child4) {
		children = new ArrayList<Topografia>();
		this.add(child1, child2, child3, child4);
	}
	
	private void add (Topografia child1, Topografia child2, Topografia child3, Topografia child4) {
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
	public boolean comparar(Topografia t) {
		return t.compararConMixto(this);
	}
	
	@Override
	public boolean compararConMixto(Mixto mixto) {
/*		return this.children.get(0).comparar(mixto.children.get(0)) && 
				this.children.get(1).comparar(mixto.children.get(1)) &&
				this.children.get(2).comparar(mixto.children.get(2)) &&
				this.children.get(3).comparar(mixto.children.get(3));
*/
		return this.children.equals(mixto.children);
	}

}
