package com.test;
import java.util.*;
 abstract class CarWale
{ 
abstract void baseCar(int cc);		
}
class ChildCar extends CarWale
{
	@Override
	 public void baseCar(int d)
	{
	System.out.print(" Sedan:  "+d);
	System.out.print(" SUV: "+d);
	System.out.print(" Hatchback: "+d);
	}
}
class jump
{
public static void main(String args[])
{
	
	int a=1100, b=1200, c=900;
   CarWale aa= new ChildCar();
	
	Scanner sc=new Scanner (System.in);
	System.out.print("To know Engine_cc Press 1 for Sedan ..... Press 2 for SUV ..... Press 3 for Hatchback");
	int d = sc.nextInt();
	switch (d)
	{
	case 1:
	     aa.baseCar(a);
	break;
	case 2:
	aa.baseCar(b);
	break;
	case 3:
	aa.baseCar(c);
	break;
	default:
	System.out.println("You have entered wrong no.");
	}
}
}