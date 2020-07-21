package test200709;



public class I02_ArrayExample1 {

	public static void main(String[] args) {
		// 크기가 5인 정수형 배열을 선언하여
		// 값을 임의로 입력하고
		// 입력된 값들의 총합과 평균을 구하시오.
		
		int[] option = new int[5];
		option[0] = 3;
		option[1] = 6;
		option[2] = 9;
		option[3] = 12;
		option[4] = 15;
		
		int sum = 0;
		int average = 0;
		//int count = 0;
		for (int i = 0; i<option.length; i++) {
			sum+=option[i];
			//count++;
			average = sum/option.length;
			/*전 처럼 count변수를 선언해 반복한 개수를 
			구하여서 나눠도 되지만 이미 크기 메소드가
			값을 갖고 있기 때문에 이게 더 간편함*/
			
		}
		System.out.println("총합계 : "+sum);
		System.out.println("총평균 : "+average);
		
		
		
		

	}

}
