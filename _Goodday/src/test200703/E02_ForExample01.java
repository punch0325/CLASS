package test200703;

public class E02_ForExample01 {

	public static void main(String[] args) {
		// 3~9까지 출력하기
		/*  for (int num =3; num<=9; num++ ) {
			System.out.println(num);
		    }    */
		
		
		// 1부터 10까지 합한 결과 출력
		int sum = 0;
		
		for (int num = 1; num <=10; num++) {
			sum+=num;  //sum=sum+num
		   if(num<=9) {
			 System.out.print(num+"+");
		   }else if (num==10) {
			 System.out.print(num+"=");
			//System.out.print(num);
			   }
			
		} System.out.print(sum);
		  //System.out.print("="+sum);
		
		//마지막 출력 값인 55가 최종적으로 출력
	    /* 만약 출력 메소드가 for문 안에 있으면
	       sum+=num에 들어 
	       있는 반복값이 모두 출력*/



		
	}

}
