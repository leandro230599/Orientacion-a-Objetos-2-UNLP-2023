package ar.edu.unlp.info.oo2.ejercicio_10;

import java.time.LocalDate;

public class Administrador {
	
	private Proyecto proyecto;
	
	public void crearProyecto (LocalDate inicio, LocalDate fin, String objetivo, int integrantes, int monto) {
		this.proyecto = new Proyecto(inicio, fin, objetivo, integrantes, monto);
	}
	
	public void aprobarEtapa () {
		this.proyecto.aprobarEtapa();
	}
}
