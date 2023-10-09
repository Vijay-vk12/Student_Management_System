package com;

public class Car {
String id;
String brand;
static int count=200;
public Car(String brand)
{
	this.brand=brand;
	this.id="B"+count;
	count++;
}
	public static void main(String[] args) {
		Car c=new Car(" toyata");
		System.out.println(c.id+" "+c.brand);
	}

}
