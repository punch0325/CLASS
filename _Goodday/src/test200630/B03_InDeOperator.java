package test200630;

public class B03_InDeOperator {

	public static void main(String[] args) {
		int num1, num2, num3 = 0;
		num1 = 4;
		num2 = 3;
		
		System.out.println(num1);//4
		System.out.println(num3);//0
		
		num3 = num1++;
		System.out.println(num1);//5
		System.out.println(num3);//4
		/* 증감연산자가 뒤에 오면 계산 후 최종적으로 1을 증감
		     시키는 방식이기 때문에, num3의 값은 num1이
		     원래 가지고 있던 4를 담아 출력이 되고 난 후
		   증감 연산자에 따라 num1은 1이 증가 되어 5가 출력
		 */
		
		num3 = ++num1;
		System.out.println(num1);//6
		System.out.println(num3);//6
		/* -위의 계산식 때문에 num1의 값은 5가 됨
		   증감연산자가 앞에 오면 num1에 1을 먼저 증가 시킨 
		  6으로 계산을 하기 때문에 똑같이 num3에는 6이 출력
	    */
		
		num3 = --num1;
		System.out.println(num1);//5
		System.out.println(num3);//5
		
		num3 = num1--;
		System.out.println(num1);//4
		System.out.println(num3);//5
		
		num3 = num1++ - num2--;
		System.out.println("예제1 : "+num1);//5
		System.out.println("예제1 : "+num2);//2
		System.out.println("예제1 : "+num3);//1
		
		num3 = --num1 * num2--;
		System.out.println("예제2 : "+num1);//4
		System.out.println("예제2 : "+num2);//1
		System.out.println("예제2 : "+num3);//8
		
		
	}

}
