package ar.edu.unlp.info.oo2.ejercicio_11;

public class _4GConnection {
	private String symb = "4G";
	
	public String symb() {
		return this.symb;
	}
	
	public String transmit(String data, long crc) {
		return data+" "+crc;
	}
}
