package com.yb.car;

import java.util.Scanner;

public class car {
	String name;
	double tank;  //油箱储油量
	double oilComsuption;//每公里耗油量
	
 public	car(String n,double t,double o)
	{
		name=n;
		tank=t;
		oilComsuption=o;
	}
	
	public static void main(String [] args)
	{
		Scanner sc=new  Scanner(System.in);
		car c=new car(sc.next(),sc.nextDouble(),sc.nextDouble());
		c.run();
		c.display();
	}
	
	public boolean run()
	{
		if(tank!=0)
			return true;  //油箱不空，汽车能跑
		else
		return false;   //油箱为空，汽车不能跑
	}
	
	public double gas(double gas)   //汽车加油
	{
		tank+=gas;  
		return tank;
		
	}
	
	public void display()
	{
		System.out.println("汽车的型号为："+name);
		System.out.println("汽车的油量为："+tank);
		System.out.println("汽车每公里耗油量为："+oilComsuption);
	}

}
