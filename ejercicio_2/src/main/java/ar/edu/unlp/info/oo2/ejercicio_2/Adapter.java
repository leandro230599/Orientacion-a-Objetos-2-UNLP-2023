package ar.edu.unlp.info.oo2.ejercicio_2;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Adapter extends VoorheesExporter {
	

	public String exportar(List<Socio> socios) {
		JSONArray lista = new JSONArray();
		for (Socio socio : socios) {
			JSONObject jsonobject = new JSONObject();
			jsonobject.put("nombre",socio.getNombre());
			jsonobject.put("email",socio.getEmail());
			jsonobject.put("legajo",socio.getLegajo());
			lista.add(jsonobject);
		}
		return lista.toJSONString();
	}
		
}
