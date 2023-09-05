package ar.edu.unlp.info.oo2.ejercicio_8;

public abstract class State {
	
	public void inscribir (Usuario unUsuario,Excursion excursion) {
		excursion.añadirInscripto(unUsuario);
	}
	
	public String obtenerInformacion(Excursion excursion) {
		return excursion.getNombre()
				+", "+excursion.getCosto()
				+", del "+excursion.getInicio()
				+" al "+excursion.getFin()
				+", "+excursion.getPuntoEncuentro();
	}
}
