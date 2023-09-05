package ar.edu.unlp.info.oo2.ejercicio_15;

import java.util.List;
import java.util.ArrayList;


/**
 * Esta clase se posee y utiliza sensores para obtener las temperaturas, pero aqui se implementa manual en el constructor para fines de testeos
 */
public class HomeWeatherStation {
	private double fahrenheit;
	private double presion;
	private double radiacion;
	private List<Double> historico;
	
	public HomeWeatherStation(double fahrenheit, double presion, double radiacion, List<Double> historico) {
		super();
		this.fahrenheit = fahrenheit;
		this.presion = presion;
		this.radiacion = radiacion;
		this.historico = historico;
	}

	public double getTemperaturaFahrenheit() {
		return fahrenheit;
	}

	public double getPresion() {
		return presion;
	}

	public double getRadiacionSolar() {
		return radiacion;
	}

	public List<Double> getTemperaturasFahrenheit() {
		return historico;
	}
	
}
