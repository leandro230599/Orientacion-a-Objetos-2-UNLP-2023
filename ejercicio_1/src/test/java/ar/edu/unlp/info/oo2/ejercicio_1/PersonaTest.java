/**
 * 
 */
package ar.edu.unlp.info.oo2.ejercicio_1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonaTest {
	Twitter twitter;
	Usuario user1;
	Usuario user2;
	
	@BeforeEach
	void setUp() throws Exception {
		twitter = new Twitter();
		twitter.addUser("leandro");
		twitter.addUser("delicia");
		twitter.addUser("micaela");
		twitter.addUser("leandro");
		twitter.addUser("hector");
		user1 = twitter.getUser("leandro");
		user2 = twitter.getUser("micaela");
	}
    @Test
    public void testGetUsers() {
    	  assertEquals(twitter.getUsers().size(), 4);
        
    }
    @Test
    public void testGetScreenName() {
    	assertEquals(user1.getScreenName(), "leandro");
    	assertEquals(user2.getScreenName(), "micaela");
    }
}
