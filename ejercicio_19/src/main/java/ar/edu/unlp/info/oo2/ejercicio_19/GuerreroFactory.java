package ar.edu.unlp.info.oo2.ejercicio_19;

public class GuerreroFactory implements Factory{

	@Override
	public Personaje crearPersonaje(String nombre) {
		return new Personaje(nombre, new ArmaduraDeAcero(), new Espada(), "Cuerpo a cuerpo" );
	}
	
}
