package test200630;

import java.util.Scanner;

public class B07_ifExample {

	public static void main(String[] args) {
		/* 성적 출력하기
		 * 자바 점수가 60점 이상이면 "합격했습니다." 출력
		 * 60점 미만이면 "불합격 했습니다." 출력
		 */
		int num1 =0;
		num1=90;
		
		if(num1>=60) {
			System.out.println("합격했습니다.");
		}else {
			System.out.println("불합격했습니다.");
		}
		
		//트렐로 학점 예제
		Scanner scan1 = new Scanner(System.in);
		
		int score = 0;
		
		System.out.print("\n점수를 입력하세요 : ");
		score = scan1.nextInt();
		if(score<=60) {
			System.out.println("F학점입니다.");
		}else if(score>=60&&score<70) {
			System.out.println("D학점입니다.");
		}else if(score>=70&&score<80) {
			System.out.println("C학점입니다.");
		}else if(score>=80&&score<90) {
			System.out.println("B학점입니다.");
		}else if(score>=90&&score<=100){
			System.out.println("A학점입니다.");
		}else {
			System.out.println("입력 범위를 초과하였습니다.");
		}
			
		
		//위 처럼 해도 되고 밑 처럼 해도 됨
		System.out.print("\n점수를 입력하세요 : ");
		score = scan1.nextInt();
		if(score>100) {
			System.out.println("점수 입력 범위를 초과하였습니다.");
		}
		else if(score>=90) {
			System.out.println("A학점입니다.");
		}else if(score>=80) {
			System.out.println("B학점입니다.");
		}else if(score>=70) {
			System.out.println("C학점입니다.");
		}else if(score>=60) {
			System.out.println("D학점입니다.");
		}else {
			System.out.println("F학점입니다.");
		}
		
		scan1.close();
		
	 
		
		

	}

}
