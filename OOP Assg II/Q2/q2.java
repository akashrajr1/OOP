import java.util.Scanner;

class Point {
	private int x,y;
	Point(int x,int y){
		this.x=x;
		this.y=y;
	}
	void display()
	{
		System.out.println("X\t\t"+x+"Y\t\t"+y);
	}
}

class Circle extends Point{
	private float radius;
	private float area=3.141*radius*radius;
	Circle(int x,int y,float r){
		super.(x,y);
		radius=r;
	}

	float getRadius(){
		return radius;
	}

	float getArea(){
		return area;
	}

	void display()
	{
		super.display();
		System.out.println("Radius\t"+radius+"\nArea\t"+area);
	}
}

class Cylinder extends Circle{
	private float height,surfaceArea,volume;
	surfaceArea=4*3.141*super.getRadius()*height;
	volume=super.getArea()*height;
}