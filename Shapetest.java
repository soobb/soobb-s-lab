package Oop4;

public class Shapetest {
	public static void main(String[] args) {
		
		printArea(new Circle());
		printArea(new Rectangle());
		printArea(new Triangle());
	}

	private static void printArea(Shape s) {
		s.res =s.area();
		if(s instanceof Circle) {
			Circle c = (Circle) s;
			System.out.println("��������" + c.r + "�� ���� ���̴�" + c.res+ "�Դϴ�.");
		} else if (s instanceof Rectangle) {
			Rectangle r =(Rectangle) s;
			System.out.println("���̰�" + r.w + r.h + "�� �簢���� ���̴�" + r.res + "�Դϴ�.");
		} else if (s instanceof Triangle) {
			 Triangle t =(Triangle) s;
			System.out.println("���̰�" + t.w + t.h + "�� �簢���� ���̴�" + t.res + "�Դϴ�.");
		}
	
	
	}
	
	

}
