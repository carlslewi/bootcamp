package com.patterns.patterns;

public class PersonProxy implements IProxy {
	private Person p;
	public PersonProxy(Person p) {
		this.p=p;
	}
	public void before() {
		System.out.println("Antes");
	}
	public void after() {
		System.out.println("Despues");
	}
	@Override
	public void operation() {
		before();
		operation();
		after();
	}
}
