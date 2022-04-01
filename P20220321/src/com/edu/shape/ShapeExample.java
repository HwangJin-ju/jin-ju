package com.edu.shape;

public class ShapeExample {
	public static void main(String[] args) {
		Shape s1 = new Rectangle();
		Shape s2 = new Circle();
		Shape s3 = new Triangle();
		
		if(s1 instanceof Rectangle) {
			Rectangle r1 = (Rectangle) s1;
			r1.setWidth(12.3);
			r1.setHeight(7.8);
			System.out.println(r1.getArea());
		}
		
		if(s2 instanceof Circle) {
			Circle c1 = (Circle) s2;
			c1.setRadius(6.3);
			System.out.println(c1.getArea());
		}
		
		if (s3 instanceof Triangle) {
			Triangle t1 = (Triangle) s3;
			t1.setBase(5.2);
			t1.setHeight(8.8);
			System.out.printf("%.2f", t1.getArea());
		}
	}
}
