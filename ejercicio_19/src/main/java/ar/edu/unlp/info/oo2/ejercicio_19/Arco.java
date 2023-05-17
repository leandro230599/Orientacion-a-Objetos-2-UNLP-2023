package ar.edu.unlp.info.oo2.ejercicio_19;

public class Arco implements Arma{

	@Override
	public int getDañoInflingido(Armadura armadura) {
		return armadura.getDañoRecibidoPorArco();
	}

}
