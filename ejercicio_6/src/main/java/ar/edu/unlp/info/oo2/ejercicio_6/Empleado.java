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
	
	abstract public int sueldo();
	
	
}
