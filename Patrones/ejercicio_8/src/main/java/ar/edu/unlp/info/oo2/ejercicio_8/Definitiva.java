package ar.edu.unlp.info.oo2.ejercicio_8;

import java.util.stream.Collectors;

public class Definitiva extends State{
	
	public void inscribir (Usuario unUsuario,Excursion excursion) {
		super.inscribir(unUsuario, excursion);
		if (excursion.getCupoMaximo()==excursion.getInscriptos().size()) {
			excursion.ChangeState(new Llena());
		}
	}
	
	public String obtenerInformacion(Excursion excursion) {
		return super.obtenerInformacion(excursion)
				+" , los inscriptos son "
				+excursion.getInscriptos().stream().map(i -> i.getEmail()).collect(Collectors.joining(", "))
				+" , y faltan "+ (excursion.getCupoMaximo()-excursion.getInscriptos().size())+" para cupo maximo";
	}
}
