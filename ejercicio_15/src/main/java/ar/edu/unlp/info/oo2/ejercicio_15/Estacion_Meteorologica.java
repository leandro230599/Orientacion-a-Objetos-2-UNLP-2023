package ar.edu.unlp.info.oo2.ejercicio_15;

import java.util.List;

public class Estacion_Meteorologica extends HomeWeatherStation implements Component{

	public Estacion_Meteorologica(double fahrenheit, double presion, double radiacion, List<Double> historico) {
		super(fahrenheit, presion, radiacion, historico);
	}
	
	public double getTemperaturaCelcius() {
		// La temperatura en grados Celsius (ºC = (ºF-32) ÷ 1.8). CUADERNILLO DE ACTIVIDADES asi lo define
		return (this.getTemperaturaFahrenheit()-32)/1.8;
	}
	
	public double getPromedioHistorico() {
		return (this.getTemperaturasFahrenheit().stream().mapToDouble(d -> d).sum()) / this.getTemperaturasFahrenheit().size(); 
	}
	
	public String displayData() {
		return "";
	}

}
