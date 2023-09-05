package ar.edu.unlp.info.oo2.ejercicio_8;

public class Llena extends State{
	
	public void inscribir (Usuario unUsuario,Excursion excursion) {
		excursion.añadirListaEspera(unUsuario);
	}
}
