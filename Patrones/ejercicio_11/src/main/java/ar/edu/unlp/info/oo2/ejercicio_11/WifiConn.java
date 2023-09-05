package ar.edu.unlp.info.oo2.ejercicio_11;

public class WifiConn implements Connection {
	private String pict = "WIFI";
	
	public String sendData(String data, long crc) {
		return data+" "+crc;
	}
	
	public String pict() {
		return this.pict;
	}
}
