package test200715;

public class Calculator {

	//덧셈, 뺄셈, 곱셈, 나눗셈 계산 메소드 만들기!
	
    //덧셈 메소드 선언1
     /*
      * 리턴 : 없음
      * 매개변수 : 정수형 변수 2개
      * 메소드 이름 : sum
      * 메소드 수행 내용 : 매개변수 2개의 합을 출력 
      */
	void sum(int num1, int num2) {
		System.out.println(num1+num2);
	}
//	만약 리턴이 없는 메소드이면 리턴타입이 오는 자리에 void를 쓰면 됨

	//덧셈 메소드 선언2
	/*
     * 리턴 : 정수값 리턴
     * 매개변수 : 정수형 변수 2개
     * 메소드 이름 : sum0
     * 메소드 수행 내용 : - 매개변수 2개의 합 계산 
                     - 합산 결과 리턴 
     */	
	int sum0 (int num1, int num2) {
		int sum = num1+num2;
		return sum;
	}













}
