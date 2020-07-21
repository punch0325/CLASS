package test200630;

import java.util.Scanner;

public class B04_Scanner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		System.out.print("이름을 입력하세요 : ");
		String name="";
		name = scan.nextLine();
		System.out.println("입력한 이름 " + name);
		
		System.out.print("주소를 입력하세요 : ");
		String adress = "";
		adress = scan.nextLine();
		System.out.println("입력한 주소 " + adress);
		
		int age = 0;
		System.out.print("나이를 입력하세요 : ");
		age = scan.nextInt();
		System.out.println("입력한 나이" + age);
		
		scan.close();
		

		
		

	}

}
