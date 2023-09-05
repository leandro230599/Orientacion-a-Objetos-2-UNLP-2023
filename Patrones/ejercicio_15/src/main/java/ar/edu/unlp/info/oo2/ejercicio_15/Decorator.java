package ar.edu.unlp.info.oo2.ejercicio_15;

import java.util.List;

public abstract class Decorator implements Component{
	
	private Component wrapper;
	
	public Decorator (Component wrapper) {
		this.wrapper = wrapper;
	}

	@Override
	public double getTemperaturaFahrenheit() {
		return this.wrapper.getTemperaturaFahrenheit();
	}

	@Override
	public double getPresion() {
		return this.wrapper.getPresion();
	}

	@Override
	public double getRadiacionSolar() {
		return this.wrapper.getRadiacionSolar();
	}

	@Override
	public List<Double> getTemperaturasFahrenheit() {
		return this.wrapper.getTemperaturasFahrenheit();
	}

	@Override
	public double getTemperaturaCelcius() {
		return this.wrapper.getTemperaturaCelcius();
	}

	@Override
	public double getPromedioHistorico() {
		return this.wrapper.getPromedioHistorico();
	}
	
	@Override
	public String displayData() {
		if (this.wrapper.displayData() != "") {
			return this.print()+" "+ this.wrapper.displayData();
		}
		return this.print();
	}
	
	public abstract String print();

}
