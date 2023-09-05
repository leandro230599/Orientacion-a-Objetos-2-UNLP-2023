package ar.edu.unlp.info.oo2.ejercicio_19;

public class ArmaduraDeCuero implements Armadura{

	@Override
	public int getDañoRecibidoPorEspada() {
		return 8;
	}

	@Override
	public int getDañoRecibidoPorArco() {
		return 5;
	}

	@Override
	public int getDañoRecibidoPorBaston() {
		return 2;
	}

}
