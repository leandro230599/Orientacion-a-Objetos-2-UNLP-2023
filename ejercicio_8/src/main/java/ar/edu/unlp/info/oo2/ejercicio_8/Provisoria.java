package ar.edu.unlp.info.oo2.ejercicio_8;

public class Provisoria extends State{
	
	public void inscribir (Usuario unUsuario,Excursion excursion) {
		super.inscribir(unUsuario, excursion);
		if (excursion.getCupoMinimo()==excursion.getInscriptos().size()) {
			excursion.ChangeState(new Definitiva());
		}
	}
	
	public String obtenerInformacion(Excursion excursion) {
		return super.obtenerInformacion(excursion)
				+" , faltan "
				+(excursion.getCupoMinimo()-excursion.getInscriptos().size())+" usuarios ";
	}
}
