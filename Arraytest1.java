package Array;

public class Arraytest1 {

	public static void main(String[] args) {
		int[] n = new int[] { 100, 90, 85 }; // �ݵ�� [3]�� 3�� ������ ��.//[]�ϳ��� ������ ��

		int total = 0;
		for (int i = 0; i < n.length; i++) { // i<=3 �ε��� ���� ���
			total += n[i];
		}
		System.out.println(total/n.length);
	}

}
