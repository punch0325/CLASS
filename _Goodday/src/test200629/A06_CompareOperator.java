package test200629;

public class A06_CompareOperator {

	public static void main(String[] args) {

		int num1 = 0, num2 = 0;
		boolean result = false;
		
		num1 = 7;
		num2 = 3;
		System.out.println(num1>=num2);
		
		result = num1 == num2;
		System.out.println(result);
		result = num2 > num1;
		System.out.println(result);
		result = num1 > num2;
		System.out.println(result);
		
		String str1 = "java";
		String str2 = "JAVA";
		result = str1.equals(str2);
		System.out.println(result);
		
		

	}

}
