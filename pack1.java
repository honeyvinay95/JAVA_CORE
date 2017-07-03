package com.test;
 abstract class Bike
{
abstract int baseCar();		
}
class TestCar extends Bike
{
	 int baseCar()
	{
	return 100;
	}
}
class Car
{
public static void main(String args[])
{
	Bike a;
	a= new TestCar();
	System.out.println("Enginecc: "+a.baseCar());
	
}
}