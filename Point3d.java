package Oop;

public class Point3d extends Point2d {
 private int z;

public int getZ
() {
	return z;
}

public void setZ(int z) {
	this.z = z;
}
 public void print() {//�����̸��ε� Ȯ���ϴ� ���� method overriding
	 
	 System.out.println("z =" + this.getZ());

 }
 
}
