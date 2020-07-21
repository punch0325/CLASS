package test200714;

public class L04_Casting {

	public static void main(String[] args) {
		/*
		 *형변환
		 *특정 타입의 변수를 다른 타입의 변수로 변환하는 것
		 *1. 자동형변환
		 *   - 크기가 작은 타입이 큰 타입으로 변환
		 *2. 강제 형변환
		 *   - 크기가 큰 타입이 작은 타입으로 변환
		 */
		
		int intVar = 10;
		double doubleVar = 1.0;
		
		doubleVar = intVar;
		intVar = (int) doubleVar;
//		         double 타입의 변수를 강제적으로
//		         int 타입의 변수로 강제 형변환을 시켜준 것
		
		

	}

}
