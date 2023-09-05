package ar.edu.unlp.info.oo2.ejercicio_10;

public class Evaluacion extends State {

	@Override
	public void aprobarEtapa(Proyecto proyecto) {
		proyecto.changeState(new Confirmado());
	}
	
	@Override
	public void cambiarMargen(int margen, Proyecto proyecto) {
		if (margen >= 11 && margen <=15) {
			proyecto.changeMargen(margen);
		}
	}
}
