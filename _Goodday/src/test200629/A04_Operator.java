package test200629;

public class A04_Operator {

	public static void main(String[] args) {
		/*
		 * 1. 정수형 변수 2개 선언 
		 * 2. 연산자를 활용하여 각각 연산을 수행 후 결과 출력
		 */

		int XX_X = 0;
		int X_X1 = 0, X_X2 = 0;

		X_X1 = 607;
		X_X2 = 50;

		XX_X = X_X1 + X_X2;
		System.out.println(XX_X);
		XX_X = X_X1 - X_X2;
		System.out.println(XX_X);
		XX_X = X_X1 * X_X2;
		System.out.println(XX_X);
		XX_X = X_X1 / X_X2;
		System.out.println(XX_X);
		XX_X = X_X1 % X_X2;
		System.out.println(XX_X);

	}

}
