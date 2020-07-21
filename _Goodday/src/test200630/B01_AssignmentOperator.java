package test200630;

public class B01_AssignmentOperator {

	public static void main(String[] args) {
		int num1, num2, num3 = 0;
		num1 = 7;
		num2 = 3;
		System.out.println(num1);//7출력
		System.out.println(num2);//3출력
		
		num1+=num2;
		System.out.println(num1);//10출력
		System.out.println(num2);//3출력
		
		num1-=num2;
		System.out.println(num1);//7출력
		System.out.println(num2);//3출력
		
		num1-=num2;
		System.out.println(num1);//4출력
		System.out.println(num2);//3출력
		
		num1*=num2;
		System.out.println(num1);//12출력
		System.out.println(num2);//3출력
		
		num3 = num1 -= num2;
		System.out.println(num1);//9출력
		System.out.println(num2);//3출력
		System.out.println(num3);//9출력
		
		num2 = num1 *= num2;
		System.out.println(num1);//27
		System.out.println(num2);//27
	}

}
