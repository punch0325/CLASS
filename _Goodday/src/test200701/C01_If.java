package test200701;

import java.util.Scanner;

public class C01_If {

	public static void main(String[] args) {
		//트렐로 중첩 if문
		
		int num=0;
		String sco="";
		Scanner scan001 = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		num=scan001.nextInt();
	
		if(num<=100) {
			if(num>=90) {
				if(num>=95) {
					sco="A+";
				}else {
					sco ="A";}							
			}else if (num>=80) {
				if (num>=85) {
						sco="B+";
				}else {
						sco="B";}
			}else if (num>=70) {
				if (num>=75) {
						sco="C+";
				}else {sco="C";}
			}else if (num>=60) {
				if (num>=65) {
						sco="D+";
				}else {sco="D";}
		    }else {sco="F";}
	        System.out.println("당신의 학점은 "+sco+" 입니다♬");
		}else {
			System.out.println("입력 범위 초과");
		}
		
		scan001.close();
		
			
					
	
		
		

	}

}
