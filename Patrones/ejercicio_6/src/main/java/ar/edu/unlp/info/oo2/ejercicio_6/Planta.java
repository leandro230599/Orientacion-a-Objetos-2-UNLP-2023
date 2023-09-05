package ar.edu.unlp.info.oo2.ejercicio_6;

public class Planta extends Empleado {

	public Planta(int horas, boolean casado, int hijos, int antiguedad, int examenes) {
		super(horas, casado, hijos, antiguedad, examenes);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double basico() {
		return 50000;
	}

	@Override
	public double adicional() {
		return (this.isCasado() ? 5000 : 0) + (2000 * this.getHijos()) + (2000 * this.getAntiguedad());
	}


}
