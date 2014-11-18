package com.epam.ObserverPattern;

import com.epam.ObserverPattern.domain.Subject;

/**
 * Hello world!
 *
 */
public class Application {
	
	public static void main(String[] args) {
		Subject sub1 = new Subject("Subject1", "City1");
		Subject sub2 = new Subject("Subject2", "City2");
		Subject sub3 = new Subject("Subject3", "City3");
		Subject sub4 = new Subject("Subject4", "City4");

		Observer observer1 = new Observer("Observer1");
		Observer observer2 = new Observer("Observer2");

		sub1.registerObserver(observer1);
		sub2.registerObserver(observer1);

		sub3.registerObserver(observer2);
		sub4.registerObserver(observer2);

		sub1.updateCity("AA");
		sub2.updateCity("BB");
	}
}
