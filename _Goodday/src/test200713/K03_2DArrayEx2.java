package test200713;


import java.util.Scanner;

public class K03_2DArrayEx2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[][] question = {{"chair","의자"},
				               {"desk","책상"},
				               {"water","물"},
				               {"pencil","연필"},
				               {"watch","시계"}};
		                      // 5행 2열 크기의 2차 배열
		String answer = "";
		double count = 0;
		double percent = 0;
		
		for (int i = 0; i<question.length; i++) {
			System.out.print("문제"+(i+1)+". "+question[i][0]+"의 뜻은 무엇일까요 ? ");
			answer = scan.nextLine();
			
			if (question[i][1].equals(answer)) {
				System.out.println("정답입니다!");
				count++;
			}else {
				System.out.println("틀렸습니다.");
				System.out.println("정답은 "+question[i][1]+"입니다.");
			}
			
		}
		percent = 100 * (count/question.length);
		System.out.println();
		System.out.println("총 "+count+"개 맞췄습니다♥");
		System.out.println("정답률은 "+percent+"% 입니다!");
		
		
//		System.out.print("문제1. chair의 뜻은 무엇인가요? ");
//		answer = scan.nextLine();
//		if (answer.equals("의자")) {
//			System.out.println("정답입니다!");
//		}else {
//			System.out.println("틀렸습니다.");
//			System.out.println("정답은 의자 입니다.");
//		}
//		
//		System.out.print("문제2. desk의 뜻은 무엇인가요? ");
//		answer = scan.nextLine();
//		if (answer.equals("책상")) {
//			System.out.println("정답입니다!");
//		}else {
//			System.out.println("틀렸습니다.");
//			System.out.println("정답은 책상 입니다.");
//		}
//		
//		System.out.print("문제3. water의 뜻은 무엇인가요? ");
//		answer = scan.nextLine();
//		if (answer.equals("물")) {
//			System.out.println("정답입니다!");
//		}else {
//			System.out.println("틀렸습니다.");
//			System.out.println("정답은 물 입니다.");
//		}
//		
//		System.out.print("문제4. pencil의 뜻은 무엇인가요? ");
//		answer = scan.nextLine();
//		if (answer.equals("연필")) {
//			System.out.println("정답입니다!");
//		}else {
//			System.out.println("틀렸습니다.");
//			System.out.println("정답은 연필 입니다.");
//		}
//		
//		System.out.print("문제5. watch의 뜻은 무엇인가요? ");
//		answer = scan.nextLine();
//		if (answer.equals("시계")) {
//			System.out.println("정답입니다!");
//		}else {
//			System.out.println("틀렸습니다.");
//			System.out.println("정답은 시계 입니다.");
//		}
//		
//		
		
		
		scan.close();
		
		
		
		
		
	}

}
