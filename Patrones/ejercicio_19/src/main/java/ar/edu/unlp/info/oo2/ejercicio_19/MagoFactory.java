package ar.edu.unlp.info.oo2.ejercicio_19;

public class MagoFactory implements Factory{

	@Override
	public Personaje crearPersonaje(String nombre) {
		return new Personaje (nombre, new ArmaduraDeCuero(), new Espada(), "A distancia");
	}
	
}
