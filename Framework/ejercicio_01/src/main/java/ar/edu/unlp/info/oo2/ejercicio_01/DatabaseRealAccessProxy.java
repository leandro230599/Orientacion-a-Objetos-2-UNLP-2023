package ar.edu.unlp.info.oo2.ejercicio_01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.*;
public class DatabaseRealAccessProxy implements DatabaseAccess{
	
	private Logger logger;
    private List<String> listaCensura;
    private Handler handler;
	
	private DatabaseRealAccess database;
	private boolean login = false;
	
	public DatabaseRealAccessProxy (boolean login) throws IOException {
		this.login = login;
		this.database = new DatabaseRealAccess();
		this.logger = Logger.getLogger("accessDB");
		//FileHandler handler = new FileHandler("log.txt");
		// Inciso B para Mayuscula   handler.setFormatter(new InfoToUpperCase());
		// handler.setFormatter(new JSONFormatter()); // Inciso B para JSON
	    this.listaCensura = new ArrayList<String>();
	    this.listaCensura.add("Acceso");
	    this.listaCensura.add("DB");
	    this.handler = new FilterHandler(new FileHandler("logDB.txt"), listaCensura);
		this.logger.addHandler(handler);
	}

	@Override
	public Collection<String> getSearchResults(String queryString) {
		if (this.checkAccess()) {
			this.logger.log(Level.INFO, "Acceso valido para busquedas en la DB!");
			return this.database.getSearchResults(queryString);
		} else {
			this.logger.log(Level.SEVERE, "Acceso invalido a la DB!");
			throw new RuntimeException("Accesso Denegado");
		}
	}

	@Override
	public int insertNewRow(List<String> rowData) {
		if (this.checkAccess()) {
			this.logger.log(Level.WARNING, "Acceso valido para inserciones en la DB!");
			return this.database.insertNewRow(rowData);
		} else {
			this.logger.log(Level.SEVERE, "Acceso invalido a la DB!");
			throw new RuntimeException("Accesso Denegado");
		}
	}
	
	public boolean checkAccess() {
		return this.login;
	}

}
