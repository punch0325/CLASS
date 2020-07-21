package test200702;

import java.util.Scanner;

public class D09_Example07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String dictionary = "";
		dictionary = "";
		System.out.print("단어를 입력하세요 : ");
		dictionary = scan.nextLine();
		
		switch (dictionary) {
		case "desk" :
			System.out.println("'책상'이라는 뜻입니다.");
			break;
		case "chair" :
			System.out.println("'의자'라는 뜻입니다.");
			break;
		case "wallet" :
			System.out.println("'지갑'이라는 뜻입니다.");
			break;
		case "book" :
			System.out.println("'책'이라는 뜻입니다.");
			break;
		default :
			System.out.println("찾을 수 없습니다.");
			break;
		}
		
       scan.close();

	}

}
