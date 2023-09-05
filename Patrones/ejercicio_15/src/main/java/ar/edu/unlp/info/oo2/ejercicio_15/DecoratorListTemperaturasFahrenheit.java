package ar.edu.unlp.info.oo2.ejercicio_15;

import java.util.stream.Collectors;

public class DecoratorListTemperaturasFahrenheit extends Decorator{

	public DecoratorListTemperaturasFahrenheit(Component wrapper) {
		super(wrapper);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String print() {
		return "Lista historica de temperaturas Fahrenheit: "+this.getTemperaturasFahrenheit().stream().map(d -> d.toString()).collect(Collectors.joining(", "));
	}

}
