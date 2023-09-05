package ar.edu.unlp.info.oo2.ejercicio_13;

import java.util.Collection;
import java.util.List;

public class DatabaseRealAccessProxy implements DatabaseAccess{
	
	private DatabaseRealAccess database;
	private boolean login = false;
	
	public DatabaseRealAccessProxy (boolean login) {
		this.login = login;
		this.database = new DatabaseRealAccess();
	}

	@Override
	public Collection<String> getSearchResults(String queryString) {
		if (this.checkAccess()) {
			return this.database.getSearchResults(queryString);
		} else {
			throw new RuntimeException("Accesso Denegado");
		}
	}

	@Override
	public int insertNewRow(List<String> rowData) {
		if (this.checkAccess()) {
			return this.database.insertNewRow(rowData);
		} else {
			throw new RuntimeException("Accesso Denegado");
		}
	}
	
	public boolean checkAccess() {
		return this.login;
	}

}
