package ar.edu.unlp.info.oo2.ejercicio_19;

public class Espada implements Arma{

	@Override
	public int getDañoInflingido(Armadura armadura) {
		return armadura.getDañoRecibidoPorEspada();
	}

}
