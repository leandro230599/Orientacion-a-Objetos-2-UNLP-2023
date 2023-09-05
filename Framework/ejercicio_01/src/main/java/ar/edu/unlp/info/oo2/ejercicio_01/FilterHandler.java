package ar.edu.unlp.info.oo2.ejercicio_01;

import java.util.List;
import java.util.logging.*;

public class FilterHandler extends Handler{
	
	private Handler handler;
	private List<String> listaCensura;
	
	public FilterHandler (Handler handler, List<String> lista) {
		this.handler = handler;
		this.listaCensura = lista;
	}
	

	@Override
	public void publish(LogRecord record) {
		String mensaje = record.getMessage();
		for (String string : listaCensura) {
			mensaje = mensaje.replaceAll(string, "***");
		}
		record.setMessage(mensaje);
		this.handler.publish(record);
		
	}

	@Override
	public void flush() {
		this.handler.flush();
		
	}

	@Override
	public void close() throws SecurityException {
		this.handler.close();
		
	}

}
