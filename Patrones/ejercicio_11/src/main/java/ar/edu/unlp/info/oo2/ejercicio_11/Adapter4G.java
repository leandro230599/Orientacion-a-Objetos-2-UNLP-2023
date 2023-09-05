package ar.edu.unlp.info.oo2.ejercicio_11;

public class Adapter4G implements Connection {
	_4GConnection _4gconnection;
	
	public Adapter4G () {
		this._4gconnection = new _4GConnection();
	}
	
	public String pict() {
		return this._4gconnection.symb();
	}

	public String sendData(String data, long crc) {
		return this._4gconnection.transmit(data, crc);
	}
}
