package ar.edu.unlp.info.oo2.ejercicio_18;

public class SubteWay {
	private Builder builder;
	
	public SubteWay(Builder builder) {
		this.builder = builder;
	}
	
	public void changeBuilder(Builder builder) {
		this.builder = builder;
	}
	
	public void armarClasico() {
		this.builder.reset();
		this.builder.agregarPan(100);
		this.builder.agregarAderezo(20);
		this.builder.agregarPrincipal(300);
		this.builder.agregarAdicional(80);
	}
	
	public void armarVegetariano() {
		this.builder.reset();
		this.builder.agregarPan(120);
		this.builder.agregarPrincipal(200);
		this.builder.agregarAdicional(100);
	}
	
	public void armarVegano() {
		this.builder.reset();
		this.builder.agregarPan(100);
		this.builder.agregarAderezo(20);
		this.builder.agregarPrincipal(500);
	}
	
	public void armarSinTACC() {
		this.builder.reset();
		this.builder.agregarPan(150);
		this.builder.agregarAderezo(18);
		this.builder.agregarPrincipal(250);
		this.builder.agregarAdicional(200);
	}
}
