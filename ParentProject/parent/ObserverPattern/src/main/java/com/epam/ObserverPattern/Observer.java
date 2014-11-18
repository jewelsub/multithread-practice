package com.epam.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

import com.epam.ObserverPattern.domain.Subject;

public class Observer {

	String observerName;

	private List<Subject> subjectList = new ArrayList<Subject>();

	/**
	 * @param observerName
	 */
	public Observer(String observerName) {
		this.observerName = observerName;
	}

	public void addSubject(Subject subject) {
		if (!subjectList.contains(subject)) {
			subjectList.add(subject);
		}
	}

	public void showMonitorReport() {
		
		System.out.println("Monitor Report by "+observerName);
		
		for (Subject sub : subjectList) {
			System.out.println("[subject: " + sub.getName() + " city :"+ sub.getCity()+"]");
		}
	}

}
