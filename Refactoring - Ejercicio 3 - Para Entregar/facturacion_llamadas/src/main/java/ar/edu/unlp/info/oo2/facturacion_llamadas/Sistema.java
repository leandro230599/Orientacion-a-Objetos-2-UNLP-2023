package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class Sistema {
	
	private List<Persona> listaClientes= new ArrayList<Persona>();
	private List<Llamada> listaLlamadas = new ArrayList<Llamada>();
	private SortedSet<String> guiaTelefonica = new TreeSet<String>();

	public boolean agregarTelefono(String str) {
		return !this.guiaTelefonica.contains(str) ? this.agregarTelefonoYRetorna(str) : false;
	}
	
	private boolean agregarTelefonoYRetorna(String str) {
		this.guiaTelefonica.add(str);
		return true;
	}
	
	public String obtenerUltimoElemento() {
		String tel = this.guiaTelefonica.last();
		guiaTelefonica.remove(tel);
		return tel;
	}
	
	public Persona registrarPersonaFisica (String documento, String fullName) {
		Persona nuevaPersonaFisica = new PersonaFisica(fullName, this.obtenerUltimoElemento(), documento);
		this.listaClientes.add(nuevaPersonaFisica);
		return nuevaPersonaFisica;
	}
	
	public Persona registrarPersonaJuridica (String cuit, String fullName) {
		Persona nuevaPersonaJuridica = new PersonaJuridica(fullName, this.obtenerUltimoElemento(), cuit);
		this.listaClientes.add(nuevaPersonaJuridica);
		return nuevaPersonaJuridica;
	}
	
	public boolean eliminarUsuario(Persona personaBorrar) {
		if (this.existeUsuario(personaBorrar)) {
			this.listaClientes.remove(personaBorrar);
			this.guiaTelefonica.add(personaBorrar.getTelefono());
			return true;
		}
		return false;
	}
	
	public Llamada registrarLlamadaNacional (Persona emisor, Persona remitente, int duracion) {
		Llamada llamadaNacional = new LlamadaNacional(emisor.getTelefono(), remitente.getTelefono(), duracion);
		return agregarLlamadaAListas(emisor, llamadaNacional);
	}
	
	public Llamada registrarLlamadaInternacional (Persona emisor, Persona remitente, int duracion) {
		Llamada llamadaInternacional = new LlamadaInternacional(emisor.getTelefono(), remitente.getTelefono(), duracion);
		return agregarLlamadaAListas(emisor, llamadaInternacional);
	}
	
	private Llamada agregarLlamadaAListas (Persona emisor, Llamada llamada) {
		listaLlamadas.add(llamada);
		return emisor.agregarLlamadaRealizada(llamada);
	}
	
	public double calcularMontoTotalLlamadas(Persona p) {
		Persona auxPersona = listaClientes.stream()
				.filter(persona -> persona.getTelefono() == p.getTelefono())
				.findFirst()
				.orElse(null);
		if (auxPersona != null) {
			return auxPersona.calcularMontoTotalLlamadas();
		}
		return 0;
	}

	public int cantidadDeUsuarios() {
		return listaClientes.size();
	}

	public boolean existeUsuario(Persona persona) {
		return listaClientes.contains(persona);
	}
	
}
