package test200710;

public class J01_BubbleEx1 {

	public static void main(String[] args) {
		// 배열 값을 지정 후 오름차순으로 정렬하기!
		
		int[] num = {10,3,7,2,4};
		int bubble = 0;
		
		for(int i = 0; i<num.length; i++) {
			for (int j = i+1; j<num.length; j++) {
				if (num[i]>num[j]) {
					bubble = num[j];
					num[j] = num [i];
					num[i] = bubble;
				}
//				System.out.print("i값 : "+i);
//				System.out.println("  j값 : "+j);
			}		
			System.out.println(num[i]);
		}
				
		
		
		
		

	}

}
