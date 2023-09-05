package ar.edu.unlp.info.oo2.ejercicio_01;

import java.util.logging.*;

public class InfoToUpperCase extends SimpleFormatter{
	
	@Override
	public String format (LogRecord record) {
		return super.format(record).toUpperCase();
	}

}
