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
 public void print() {//같은이름인데 확장하는 형태 method overriding
	 
	 System.out.println("z =" + this.getZ());

 }
 
}
