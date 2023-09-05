package ar.edu.unlp.info.oo2.ejercicio_19;

public class ArmaduraDeAcero implements Armadura {

	@Override
	public int getDañoRecibidoPorEspada() {
		return 3;
	}

	@Override
	public int getDañoRecibidoPorArco() {
		return 2;
	}

	@Override
	public int getDañoRecibidoPorBaston() {
		return 1;
	}

}
