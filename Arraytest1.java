package Array;

public class Arraytest1 {

	public static void main(String[] args) {
		int[] n = new int[] { 100, 90, 85 }; // 반드시 [3]의 3은 지워야 함.//[]하나는 무조건 열

		int total = 0;
		for (int i = 0; i < n.length; i++) { // i<=3 인덱스 범위 벗어남
			total += n[i];
		}
		System.out.println(total/n.length);
	}

}
