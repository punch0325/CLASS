package test200701;

import java.util.Scanner;

public class C01_If2 {

	public static void main(String[] args) {
		int sco = 0;
		String gra = "";
		String result="";
		Scanner scan = new Scanner(System.in);
		System.out.print("학년을 입력하시오 : ");
		gra = scan.nextLine();
		System.out.print("점수를 입력하시오 : ");
		sco = scan.nextInt();

		if (gra.equals("1학년")) {
			if (sco>=60) {
				result="합격";
			}else {
				result="불합격";
			}
		}else if (gra.equals("2학년")) {
			if (sco>=60) {
				result="합격";
			}else {
				result="불합격";
			}
		}else if (gra.equals("3학년")) {
			if (sco>=60) {
				result="합격";
			}else {
				result="불합격";
			}
		}else if (gra.equals("4학년")) {
			if (sco>=70) {
				result="합격";
			}else {
				result="불합격";
			}
			
		}System.out.println("♥당신은 "+result+" 입니다.");
		
		
        
		scan.close();
		
		
		
	}

}
