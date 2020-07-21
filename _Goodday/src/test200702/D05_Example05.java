package test200702;

import java.util.Scanner;

public class D05_Example05 {

	public static void main(String[] args) {
		//숫자 3개 중 가장 큰 값을 출력
		int num1,num2,num3 = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
	    num3 = scan.nextInt();
	    
	    if (num1>num2&&num1>num3) {
	    	System.out.println("※Largest Number  " + num1);
	    }else if (num2>num1&&num2>num3) {
	    	System.out.println("※Largest Number  " + num2);
	    }else {
	    	System.out.println("※Largest Number  " + num3);
	    }
	    
	    
	    scan.close();
	    
	}

}
