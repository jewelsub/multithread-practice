package org.SingletonPattern;

public class Display {

	private static Display display;
	
	private Display(){
		System.out.println("Instantiation of Display object");
	}

	public synchronized static Display getInstanceDisplay() {
		if (display == null) {
			display = new Display();
		}
		return display;
	}
	
	public void showDisplayText(String text){
		System.out.println("Text:"+ text);
	}
	

}
