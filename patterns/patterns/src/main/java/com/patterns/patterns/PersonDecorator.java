package com.patterns.patterns;

public class PersonDecorator implements IDecorator{
	private Person p;
	public PersonDecorator(Person p) {
		super();
		this.p=p;
	}
	@Override
	public String getName() {return p.getName();}
}
