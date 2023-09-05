/**
 * 
 */
package ar.edu.unlp.info.oo2.ejercicio_11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DispositivoTest {
	
	Dispositivo dispositivo;
	String msj;
	CRC_Calculator c16;
	CRC_Calculator c32;
	Connection wifi;
	Connection _4g;
	
	@BeforeEach
	void setUp() throws Exception {
		this.msj = "hola como estas?";
		this.dispositivo = new Dispositivo();
		this.c16 = new CRC16_Calculator();
		this.c32 = new CRC32_Calculator();
		this.wifi = new WifiConn();
		this._4g = new Adapter4G();
	}
	
    @Test
    public void testSend() {
        assertEquals(this.dispositivo.send(msj), msj+" "+this.c16.crcFor(msj));
        this.dispositivo.configurarCRC(c32);
        assertEquals(this.dispositivo.send(msj), msj+" "+this.c32.crcFor(msj));
    }
    
    @Test
    public void testconectarCon() {
    	assertEquals("WIFI", this.dispositivo.getConnection().pict());
    	this.dispositivo.conectarCon(_4g);
    	assertEquals("4G", this.dispositivo.getConnection().pict());
    }
    
    @Test
    public void testConfigurarCRC() {
    	assertEquals("CRC16_Calculator", this.dispositivo.getCRCCalculator().getClass().getSimpleName());
    	this.dispositivo.configurarCRC(c32);
    	assertEquals("CRC32_Calculator", this.dispositivo.getCRCCalculator().getClass().getSimpleName());
    }
}
