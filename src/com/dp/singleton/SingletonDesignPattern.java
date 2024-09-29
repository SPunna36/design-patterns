package com.dp.singleton;

import java.util.Objects;

public class SingletonDesignPattern {

	//private static SingletonDesignPattern singletonObject = new SingletonDesignPattern(); -- eager initialization
	private static SingletonDesignPattern singletonObject;
	
	private SingletonDesignPattern() {
		// TODO Auto-generated constructor stub
	}
	
	public static SingletonDesignPattern getInstance() {
		if(Objects.isNull(singletonObject))
			singletonObject = new SingletonDesignPattern(); // lazy initialization
		return singletonObject;
	}
}
