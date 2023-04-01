package ar.edu.unlp.info.oo2.ejercicio_3;

public class AdapterVideoStream extends Media {
	private VideoStream videostream;
	
	public AdapterVideoStream () {
		videostream = new VideoStream();
	}
	
	public String play() {
		return this.videostream.reproduce();
	}
}
