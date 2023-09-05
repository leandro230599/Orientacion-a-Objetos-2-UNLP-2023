package ar.edu.unlp.info.oo2.ejercicio_11;

public class Dispositivo {
	Connection connection;
	Ringer ringer;
	Display display;
	CRC_Calculator crcCalculator;
	
	public Dispositivo() {
		this.connection = new WifiConn();
		this.ringer = new Ringer();
		this.display = new Display();
		this.crcCalculator = new CRC16_Calculator();
	}
	
	public String send(String data) {
		long crc = this.crcCalculator.crcFor(data);
		return this.connection.sendData(data, crc);
	}
	
	public void conectarCon(Connection connection) {
		this.connection = connection;
		this.display.showBanner(this.connection.pict());
		this.ringer.ring();
	}
	
	public void configurarCRC(CRC_Calculator crcCalculator) {
		this.crcCalculator = crcCalculator;
	}
	
	public Connection getConnection() {
		return this.connection;
	}
	
	public Display getDisplay() {
		return this.display;
	}
	
	public CRC_Calculator getCRCCalculator() {
		return this.crcCalculator;
	}
}
