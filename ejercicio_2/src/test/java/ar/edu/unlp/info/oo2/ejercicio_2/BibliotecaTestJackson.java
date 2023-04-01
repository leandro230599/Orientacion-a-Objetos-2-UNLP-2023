package ar.edu.unlp.info.oo2.ejercicio_2;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

class BibliotecaTestJackson {
	
	Biblioteca biblioteca;
	
	@BeforeEach
	void setUp() throws Exception {
		biblioteca = new Biblioteca();
		biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));
		biblioteca.setExporter(new AdapterJackson());
	}
	@Test
	void testJackson(){
		ObjectMapper mapper = new ObjectMapper();
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
		try {
			Object json = mapper.readValue(biblioteca.exportarSocios(), Object.class);
			Object jsonTexto = mapper.readValue(texto, Object.class);
			assertEquals(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonTexto),
					     mapper.writerWithDefaultPrettyPrinter().writeValueAsString(json));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//assertEquals(jsonparser.parse(texto), jsonparser.parse(biblioteca.exportarSocios()));
	}

}
