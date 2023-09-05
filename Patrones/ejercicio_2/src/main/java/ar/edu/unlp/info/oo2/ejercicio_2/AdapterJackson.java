package ar.edu.unlp.info.oo2.ejercicio_2;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AdapterJackson  extends VoorheesExporter {
	
	public String exportar(List<Socio> socios) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.writeValueAsString(socios);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
