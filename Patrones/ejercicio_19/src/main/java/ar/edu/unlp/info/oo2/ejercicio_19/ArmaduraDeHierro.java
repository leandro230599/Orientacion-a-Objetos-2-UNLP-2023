package ar.edu.unlp.info.oo2.ejercicio_19;

public class ArmaduraDeHierro implements Armadura{

	@Override
	public int getDañoRecibidoPorEspada() {
		return 5;
	}

	@Override
	public int getDañoRecibidoPorArco() {
		return 3;
	}

	@Override
	public int getDañoRecibidoPorBaston() {
		return 1;
	}

}
