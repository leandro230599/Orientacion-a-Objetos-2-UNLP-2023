package ar.edu.unlp.info.oo2.ejercicio_6;

public abstract class Empleado {

	private int horasTrabajadas;
	private boolean casado;
	private int hijos;
	private int antiguedad;
	private int examenes;
	
	public Empleado (int horas, boolean casado, int hijos, int antiguedad, int examenes) {
		this.horasTrabajadas = horas;
		this.casado = casado;
		this.hijos = hijos;
		this.antiguedad = antiguedad;
		this.examenes = examenes;
	}
	
	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public boolean isCasado() {
		return casado;
	}

	public int getHijos() {
		return hijos;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public int getExamenes() {
		return examenes;
	}
	
	public double sueldo() {
		return this.basico()+this.adicional()-this.descuento();
	}
	
	public double descuento() {
		return (0.13*this.basico()) + (0.05*this.adicional());
	}
	
	abstract public double basico();
	abstract public double adicional();
	
	
	
}
