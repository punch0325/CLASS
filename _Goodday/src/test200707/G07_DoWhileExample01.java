package test200707;

import java.util.Scanner;

public class G07_DoWhileExample01 {

	public static void main(String[] args) {
		//do while을 이용한 채팅 창 만들기
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("메세지를 입력하세요");
		System.out.println("채팅을 끝내려면 '종료'를 입력하세요");
		System.out.println();

		String chat = "";
		boolean stop = true;
		
		do {
			System.out.print("> ");
			chat = scan.nextLine();
			System.out.println(chat);
			
			if (chat.equals("종료")) {
				stop = false;
				System.out.println("\n채팅이 종료 되었습니다. 입력 불가입니다.");
			}
		
		}while (stop);
	

		scan.close();
	
		
	    //위와 같은 결과 출력 가능!!
//		Scanner scan = new Scanner(System.in);
//		String chat = "";
//		System.out.println("메시지를 입력할 수 있습니다.");
//		System.out.println("채팅 종료를 원하면 'STOP'을 입력하세요.");
//		System.out.println();
//		
//		boolean stop = true;
//		while (stop){
//			System.out.print("> ");
//			chat = scan.nextLine();
//			System.out.println(chat);
//			
//			if (chat.equals("STOP")) {
//				stop = false;
//				System.out.println();
//				System.out.println("채팅 종료.");
//			}
//		}
	
	
	}

}
