package ar.edu.unlp.info.oo2.ejercicio_14;

public abstract class Decorator implements Component{
	
	private Component wrapper;
	
	public Decorator (Component wrapper) {
		this.wrapper = wrapper;
	}

	@Override
	public String getNombre() {
		return this.wrapper.getNombre();
	}

	@Override
	public String getExtension() {
		return this.wrapper.getExtension();
	}

	@Override
	public int getTamano() {
		return this.wrapper.getTamano();
	}

	@Override
	public String getFecha_creacion() {
		return this.wrapper.getFecha_creacion();
	}

	@Override
	public String getFecha_modificacion() {
		return this.wrapper.getFecha_modificacion();
	}

	@Override
	public String getPermisos() {
		return this.wrapper.getPermisos();
	}

	@Override
	public String prettyPrint() {
		if (this.wrapper.prettyPrint() !="") {
			return this.print() +" - "+this.wrapper.prettyPrint();
		}
		return this.print();
	}
	
	public abstract String print();

}
