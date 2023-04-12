package ar.edu.unlp.info.oo2.ejercicio_6;

public class Pasante extends Empleado {

	public Pasante(int horas, boolean casado, int hijos, int antiguedad, int examenes) {
		super(horas, casado, hijos, antiguedad, examenes);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double basico() {
		return 20000;
	}

	@Override
	public double adicional() {
		return 2000*this.getExamenes();
	}


}
