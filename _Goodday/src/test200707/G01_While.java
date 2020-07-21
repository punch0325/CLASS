package test200707;

public class G01_While {

	public static void main(String[] args) {
		// while 문을 이용하여 1~10까지 출력
		
//		for (int i =1; i<=10; i++){
//	      System.out.println(i); 
//	    }
//		아래 while문과 출력 값이 같음
		
		int i = 1;
		while (i<=10) {
			System.out.println("i값"+i);			
			i++; /* 만약 이 증감식이 출력 메소드 보다
			             위에 자리하고 있다면 출력 전에
			             증감식을 먼저 만나 처리하기 때문에 
			             다른 결과를 나타냄 */
		}
		System.out.println("while문 종료 후 i값 : "+i);

//		1. 반복 변수에 있는 첫 값을 출력함
//		2. 그 후에 증감연산자로 인해 값이 변하고,
//		3. 반복 변수 조건에 맞으면 다시 변한 값을 출력
//		4. 조건을 충족하지 않을 때 까지 위 과정을 계속 반복

		
	}

}
