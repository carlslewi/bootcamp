package com.patterns.patterns;
import com.patterns.patterns.Person.PersonBuilder;
import  com.patterns.patterns.Singleton.*;
public class Test {
	public static void main(String[] args) {
		//Patron Singleton
		Person p=Singleton.getInstance("Carlos");
		System.out.println(p.getName());
		//Fin Singleton
		//Builder
		Person pb=PersonBuilder.builder().name("Alfonso").build();
		System.out.println(pb.getName());
		//Patron prototype
		Person p1 = p.Clone();
		System.out.println(p1.getName());
		//Patron Decorator
		PersonDecorator pd=new PersonDecorator(p);
		System.out.println(pd.getName());
		
	}
}
