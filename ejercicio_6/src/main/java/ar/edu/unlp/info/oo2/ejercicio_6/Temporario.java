package ar.edu.unlp.info.oo2.ejercicio_6;

public class Temporario extends Empleado {

	public Temporario(int horas, boolean casado, int hijos, int antiguedad, int examenes) {
		super(horas, casado, hijos, antiguedad, examenes);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double basico() {
		return 20000+(this.getHorasTrabajadas()*300);
	}

	@Override
	public double adicional() {
		return (this.isCasado() ? 5000 : 0) + (2000 * this.getHijos());
	}

}
