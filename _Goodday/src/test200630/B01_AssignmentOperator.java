package test200630;

public class B01_AssignmentOperator {

	public static void main(String[] args) {
		int num1, num2, num3 = 0;
		num1 = 7;
		num2 = 3;
		System.out.println(num1);//7���
		System.out.println(num2);//3���
		
		num1+=num2;
		System.out.println(num1);//10���
		System.out.println(num2);//3���
		
		num1-=num2;
		System.out.println(num1);//7���
		System.out.println(num2);//3���
		
		num1-=num2;
		System.out.println(num1);//4���
		System.out.println(num2);//3���
		
		num1*=num2;
		System.out.println(num1);//12���
		System.out.println(num2);//3���
		
		num3 = num1 -= num2;
		System.out.println(num1);//9���
		System.out.println(num2);//3���
		System.out.println(num3);//9���
		
		num2 = num1 *= num2;
		System.out.println(num1);//27
		System.out.println(num2);//27
	}

}
