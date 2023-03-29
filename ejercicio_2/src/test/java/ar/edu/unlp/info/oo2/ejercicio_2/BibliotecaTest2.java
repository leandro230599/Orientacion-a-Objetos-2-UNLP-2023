package ar.edu.unlp.info.oo2.ejercicio_2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

class BibliotecaTest2 {
	
	Biblioteca biblioteca;
	
	@BeforeEach
	void setUp() throws Exception {
		biblioteca = new Biblioteca();
		biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));
		biblioteca.setExporter(new Adapter());
	}
	@Test
	void testJSONSimple() throws ParseException {
		JSONParser jsonparser = new JSONParser();
		String texto = "[\r\n"
				+ "    {\r\n"
				+ "   	 \"nombre\": \"Arya Stark\",\r\n"
				+ "   	 \"email\": \"needle@stark.com\",\r\n"
				+ "   	 \"legajo\": \"5234-5\"\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "   	 \"nombre\": \"Tyron Lannister\",\r\n"
				+ "   	 \"email\": \"tyron@thelannisters.com\",\r\n"
				+ "   	 \"legajo\": \"2345-2\"\r\n"
				+ "    }\r\n"
				+ "]";
		assertEquals(jsonparser.parse(texto), jsonparser.parse(biblioteca.exportarSocios()));
	}

}
