package ar.edu.unlp.info.oo2.ejercicio_8;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Excursion {

	private String nombre;
	private LocalDate inicio;
	private LocalDate fin;
	private String puntoEncuentro;
	private int costo;
	private int cupoMinimo;
	private int cupoMaximo;
	private List<Usuario> inscriptos;
	private List<Usuario> listaEspera;
	private State state;
	
	public Excursion (	String nombre, 
						LocalDate inicio, 
						LocalDate fin, 
						String puntoEncuentro, 
						int costo, 
						int cupoMinimo, 
						int cupoMaximo	) 
	{
		this.nombre = nombre;
		this.inicio = inicio;
		this.fin = fin;
		this.puntoEncuentro = puntoEncuentro;
		this.costo = costo;
		this.cupoMinimo = cupoMinimo;
		this.cupoMaximo = cupoMaximo;
		this.inscriptos = new ArrayList<Usuario>();
		this.listaEspera = new ArrayList<Usuario>();
		this.state = new Provisoria();
	}
	
	public String getNombre() {
		return nombre;
	}

	public LocalDate getInicio() {
		return inicio;
	}

	public LocalDate getFin() {
		return fin;
	}

	public String getPuntoEncuentro() {
		return puntoEncuentro;
	}

	public int getCosto() {
		return costo;
	}

	public int getCupoMinimo() {
		return cupoMinimo;
	}

	public int getCupoMaximo() {
		return cupoMaximo;
	}
	
	public List<Usuario> getInscriptos() {
		return inscriptos;
	}

	public List<Usuario> getListaEspera() {
		return listaEspera;
	}
	
	protected void añadirInscripto (Usuario unUsuario) {
		this.inscriptos.add(unUsuario);
	}
	
	protected void añadirListaEspera (Usuario unUsuario) {
		this.listaEspera.add(unUsuario);
	}
	
	public void inscribir (Usuario unUsuario) {
		this.state.inscribir(unUsuario, this);
	}
	
	public String obtenerInformacion() {
		return this.state.obtenerInformacion(this);
	}
	
	public void ChangeState(State state) {
		this.state = state;
	}
	
	
}
