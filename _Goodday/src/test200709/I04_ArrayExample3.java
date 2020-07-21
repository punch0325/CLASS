package test200709;

public class I04_ArrayExample3 {

	public static void main(String[] args) {
		// 배열의 값 중에서 최댓값 출력하는 법!
		
		
		int[] num = {1,10,3,90,2};
		//num[0] = 1
		//num[1] = 10
		//num[2] = 3
		//num[3] = 90
		//num[4] = 2
		int max = num[0]; // max = 1
			               
		for (int i = 0; i<num.length; i++) {
			if (max<num[i]) { //영번째 max =1 < num[0]=1
				max=num[i];   //첫번째 max =1< num[1]=10
				              //두번째 max =10 <num[2]=3
				              //세번째 max=10 <num[3]=90
				              //네번째 max=90 <num[4]=2
			}                 // max=90
		}
		System.out.println(max);
		

		/*
		 1.최댓값을 출력할 변수를 하나 선언해줌(max)
		 2.max 변수에 num 배열 변수 값 중 하나를 지정해주어
		     다른 값들과 비교할 수 있게 만들어줌
		 3.for 반복문으로 그 안에서 num 배열의 변수 값을
		     모두 반복될 수 있게 만들어 준 후,
		 4.if문으로 max가 num[i],즉 num[0],num[1],num[2],
		   num[3],num[4] 보다 작다면 max값을 그 num[i]으로
		     지정하라고 명령해줌
		 5.for문 밖에 출력 메소드를 찍어주면 마지막으로 담긴
		     가장 큰 값이 출력 됨! 
		 */
		
		
		
		
		
		
	}

}
