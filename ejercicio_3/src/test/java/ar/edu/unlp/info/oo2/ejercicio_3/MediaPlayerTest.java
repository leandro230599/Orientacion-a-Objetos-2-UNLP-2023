/**
 * 
 */
package ar.edu.unlp.info.oo2.ejercicio_3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MediaPlayerTest {
	
	MediaPlayer mediaplayer;
	
	@BeforeEach
	void setUp() throws Exception {
		
		mediaplayer = new MediaPlayer();
    	mediaplayer.addMedia(new Audio());
    	mediaplayer.addMedia(new Audio());
    	mediaplayer.addMedia(new VideoFile());
    	mediaplayer.addMedia(new AdapterVideoStream());
    	mediaplayer.addMedia(new AdapterVideoStream());
	}
    @Test
    public void testaddMedia() {
    	mediaplayer.addMedia(new Audio());
    	mediaplayer.addMedia(new VideoFile());
        assertEquals(mediaplayer.getMedia().size(), 7);        
    }
    @Test
    public void testSout() {
    	for (Media media : mediaplayer.getMedia()) {
			System.out.println(media.play());
		}
    }
}
