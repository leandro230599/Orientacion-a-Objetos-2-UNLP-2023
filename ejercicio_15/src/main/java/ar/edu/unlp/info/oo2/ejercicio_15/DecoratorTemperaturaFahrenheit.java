package ar.edu.unlp.info.oo2.ejercicio_15;

public class DecoratorTemperaturaFahrenheit extends Decorator{

	public DecoratorTemperaturaFahrenheit(Component wrapper) {
		super(wrapper);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String print() {
		return "Temperatura F°: "+(int)getTemperaturaFahrenheit();
	}

}
