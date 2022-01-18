package com.patterns.patterns;



public class Person implements IPrototype{
	private static String name;
    private static int age;
    //Constructores
    public Person(){}
    
    public Person(String name){
    	super();
    	this.name=name;
    }
    //Metodos
    
    public String getName(){
    	return name;
    }
    
    public static int getAge(){
    	return age;
    }
    
    public Person Clone() {
    	Person p=new Person(this.name);
    	return p;
    }
    
    public void operation() {
    	System.out.println("Ejecutando tarea");
    }
    //Clase PersonBuilder 
    public static class PersonBuilder {
        private String name;
        private int age;
        
        public PersonBuilder name (String name) {
            this.name = name;
            return this;
        }
        
        public static PersonBuilder builder() {
            return new PersonBuilder();
        }
        
        public PersonBuilder age (int age) {
            this.age = age;
            return this;
        }
        public Person build () {
            return new Person(this);
        }
    }
    
    private Person(PersonBuilder personBuilder) {
        super();
        this.name = personBuilder.name;
        this.age = personBuilder.age;
    }
}
