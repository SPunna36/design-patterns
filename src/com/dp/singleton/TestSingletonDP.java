package com.dp.singleton;

public class TestSingletonDP {

	public static void main(String[] args) {
		//SingletonDesignPattern sdp1 = new SingletonDesignPattern();
		
		SingletonDesignPattern sdp1 = SingletonDesignPattern.getInstance();
		SingletonDesignPattern sdp2 = SingletonDesignPattern.getInstance();
		SingletonDesignPattern sdp3 = SingletonDesignPattern.getInstance();
		
		System.out.println(sdp1.hashCode());
		System.out.println(sdp2.hashCode());
		System.out.println(sdp3.hashCode());
		
		/** ways to break the singleton design pattern
		 * 	1. Serialization
		 * 	2. Cloning
		 * 	3. Reflection
		 * 	4. Multi-threading
		 * 
		 *  We use this pattern mostly in the DB connection, reading the data from the file and utility module.
		 * 
		 */
	}
}
