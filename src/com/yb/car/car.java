package com.yb.car;

import java.util.Scanner;

public class car {
	String name;
	double tank;  //���䴢����
	double oilComsuption;//ÿ���������
	
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
			return true;  //���䲻�գ���������
		else
		return false;   //����Ϊ�գ�����������
	}
	
	public double gas(double gas)   //��������
	{
		tank+=gas;  
		return tank;
		
	}
	
	public void display()
	{
		System.out.println("�������ͺ�Ϊ��"+name);
		System.out.println("����������Ϊ��"+tank);
		System.out.println("����ÿ���������Ϊ��"+oilComsuption);
	}

}
