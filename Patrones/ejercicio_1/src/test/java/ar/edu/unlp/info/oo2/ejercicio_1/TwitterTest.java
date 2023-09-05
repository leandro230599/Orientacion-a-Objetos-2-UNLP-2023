/**
 * 
 */
package ar.edu.unlp.info.oo2.ejercicio_1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Iterator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TwitterTest {
	Twitter twitter;
	Usuario user1;
	Usuario user2;

	@BeforeEach
	void setUp() throws Exception {
		twitter = new Twitter();
		twitter.addUser("leandro");
		twitter.addUser("delicia");
		twitter.addUser("micaela");
		twitter.addUser("hector");
		user1 = twitter.getUser("leandro");
		user2 = twitter.getUser("micaela");
		user1.twittear("Caso para usar en prueba");
	}

	@Test
	public void testTwittear() {
		user1.twittear(
				"Hola, ya probe con 0 y 281 caracteres, falla correctamente");
	}
	
	@Test
	public void testListTweets() {
		user1.twittear(
				"Hola, ya probe con 0 y 281 caracteres, falla correctamente, caos de prueba ListTweets");
		System.out.println("Lista de tweet de: "+user1.getScreenName());
		for (Tweet tweet : user1.getTweets()) {
			System.out.println(tweet.getText());
		}
		System.out.println();
	}

	@Test
	public void testReTwittear() {
		user1.twittear("Este es un caso para retwittear");
		user2.retwittear(user1.getTweets().get(1));
		System.out.println("Lista de tweet de: "+user2.getScreenName());
		for (Tweet tweet : user2.getTweets()) {
			System.out.println(tweet.getText());
			System.out.println("EL ORIGEN ES "+tweet.getUser().getScreenName());
		}
		System.out.println();
	}
	
	@Test
	public void testDeleteUser() {
		System.out.println("DELETE USER");
		twitter.deleteUser("leandro");
		System.out.println("FIN DELETE");
		System.out.println();
		
	}

	@Test
	public void testExist() {
		twitter.addUser("pepe");
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
