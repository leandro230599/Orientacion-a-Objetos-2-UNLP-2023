package ar.edu.unlp.info.oo2.ejercicio_11;

import java.util.zip.CRC32;

public class CRC32_Calculator implements CRC_Calculator {

	public long crcFor(String datos) {
		CRC32 crc = new CRC32();
		crc.update(datos.getBytes());
		return crc.getValue();
	}

}
