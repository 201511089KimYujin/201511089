package com.sd.ch8;
import com.sd.ch8.*;

public class Circle extends Point{
	double radius;
	double area;
	public Circle(int x, int y, double r) {
		super(x,y);
		radius=r;
	}
	public double getArea(){
		area=radius*radius*3.14;
		return area;
	}
	public callArea(){
		System.out.println("Area is"+area);
	}
	public static void main (String[] args){
		Circle c=new Circle(100,100,10);
		c.getArea();
		c.callArea();
	}

}
