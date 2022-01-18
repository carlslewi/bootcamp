package com.patterns.patterns;

public class Singleton {

		   private static Person INSTANCE;

		   private Singleton() {}

		   public static Person getInstance(String name) {
		       if (INSTANCE == null) {
		           INSTANCE = new Person(name);
		       }
		       return INSTANCE;
		   }
}
