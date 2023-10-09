package com;

public class Employee {

	String id;
	String name;
     static int count=100;
	public Employee( String name)
	{
		this.name=name;
		this.id ="A"+count;
		count++;
		
	}
	public static void main(String[] args) {
		Employee e=new Employee("vk");
		System.out.println(e.id +" "+e.name);
		Employee e1=new Employee("mk");
		System.out.println(e1.id +" "+e1.name);
		Employee e2=new Employee("ak");
		System.out.println(e2.id +" "+e2.name);

	}

}
