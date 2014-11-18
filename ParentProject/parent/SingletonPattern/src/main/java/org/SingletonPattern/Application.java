package org.SingletonPattern;

/**
 * Hello world!
 *
 */
public class Application {
	public static void main(String[] args) {

		Display display1 = Display.getInstanceDisplay();
		display1.showDisplayText("Hello");
		
		Display display2 = Display.getInstanceDisplay();
		display2.showDisplayText("How are you");
	}
}
