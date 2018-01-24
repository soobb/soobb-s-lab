package Oop4;

public class Triangle extends Shape {
	int w = 10;
	int h = 5;

	public double area() { //int하면 소수점 밑에 잘라버려서 double 
		return w * h / 2.0;
	}
}
