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
		// object는 기본적으로 모든 클래스에서 상속받고 있음 
		Object object = new Eagle();
		System.out.println(object);
		if(object instanceof Tiger) {
			System.out.println("tiger로 캐스팅 가능");
		} else { System.out.println("tiger로 캐스팅 블가능");
		
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
