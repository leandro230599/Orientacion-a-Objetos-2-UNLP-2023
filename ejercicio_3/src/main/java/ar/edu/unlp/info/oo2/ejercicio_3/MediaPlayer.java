package ar.edu.unlp.info.oo2.ejercicio_3;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {
	private List<Media> media;
	
	public MediaPlayer() {
		media = new ArrayList<Media>();
	}
	
	public List<Media> getMedia(){
		return this.media;
	}
	
	public void addMedia(Media media) {
		this.media.add(media);
	}
}
