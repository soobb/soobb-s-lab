package Oop3;

public class Animaltest {
	public static void main(String[] args) {
		//Eagle eagle = new Eagle();
		//System.out.println(eagle);
		
	//Bird bird = new Eagle();  //upcasting
		//System.out.println(bird);
		
	////Animal animal = new Eagle();
			//System.out.println(animal);
	
	//Animal animal = bird;
	//System.out.println(animal );
			
	//Condor codor = (Condor) new Eagle();//downcasting
	//System.out.println(condor);
		// object�� �⺻������ ��� Ŭ�������� ��ӹް� ���� 
		Object object = new Eagle();
		System.out.println(object);
		if(object instanceof Tiger) {
			System.out.println("tiger�� ĳ���� ����");
		} else { System.out.println("tiger�� ĳ���� ����");
		
		}
		//Tiger tiger = (Tiger) object;
		//System.out.println(tiger);
		
	
			
			//Animal animal = new Eagle();
			//System.out.println(animal)
			//;
			//Bird bird = (Bird) animal;
			//System.out.println(bird);
			
	}

}
