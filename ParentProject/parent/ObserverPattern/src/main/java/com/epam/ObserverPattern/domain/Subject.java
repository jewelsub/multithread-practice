package com.epam.ObserverPattern.domain;

import java.util.ArrayList;
import java.util.List;

import com.epam.ObserverPattern.Observer;

public class Subject {

	private String name;

	private String city;

	private List<Observer> observerList = new ArrayList<Observer>();

	/**
	 * @param name
	 * @param city
	 */
	public Subject(String name, String city) {
		this.name = name;
		this.city = city;
	}

	public void registerObserver(Observer observer) {

		if (!observerList.contains(observer)) {
			observerList.add(observer);
			observer.addSubject(this);
		}
	}

	private void notifyObserver() {

		for (Observer obs : observerList) {
			obs.showMonitorReport();
		}
	}

	public void updateCity(String cityName) {
		this.city = cityName;
		notifyObserver();
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

}
