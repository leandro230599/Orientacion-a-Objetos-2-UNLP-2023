package ar.edu.unlp.info.oo2.ejercicio_4;

public class Simple implements Tipo{
	Terreno terreno;

	public Double getProporcionTierra() {	
		return this.terreno.getProporcionTierra();
	}
	
	public Double getProporcionAgua() {
		return this.terreno.getProporcionAgua();
	}
	
	public void setTerreno(Terreno terreno) {
		this.terreno = terreno;
	}
	
	
}
