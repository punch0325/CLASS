package test200710;

public class J01_BubbleEx1 {

	public static void main(String[] args) {
		// �迭 ���� ���� �� ������������ �����ϱ�!
		
		int[] num = {10,3,7,2,4};
		int bubble = 0;
		
		for(int i = 0; i<num.length; i++) {
			for (int j = i+1; j<num.length; j++) {
				if (num[i]>num[j]) {
					bubble = num[j];
					num[j] = num [i];
					num[i] = bubble;
				}
//				System.out.print("i�� : "+i);
//				System.out.println("  j�� : "+j);
			}		
			System.out.println(num[i]);
		}
				
		
		
		
		

	}

}
