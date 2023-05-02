package ar.edu.unlp.info.oo2.ejercicio_15;

import java.util.List;

public interface Component {

	public double getTemperaturaFahrenheit();
	public double getPresion();
	public double getRadiacionSolar();
	public List<Double> getTemperaturasFahrenheit();
	public double getTemperaturaCelcius();
	public double getPromedioHistorico();
	public String displayData();
}
