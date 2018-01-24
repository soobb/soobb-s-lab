package Oop4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Circle extends Shape {
	int r = 10;

	public double size() {
		return r * r * 3.14;

	}
	@Test
	private void testCircle() {
		Circle c = new Circle();
		assertEquals(314,c.area());

	}
	@Override
	public double area() {
		return 0;
	}
	
	
}
