package training;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class HelloWorldTest {
	@Test
	public void testGetText() {
		HelloWorld helloWorld = new HelloWorld();
		assertNotNull(helloWorld);
		assertNotNull(helloWorld.getText());
	}
}