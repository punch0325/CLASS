package test200701;

import java.util.Scanner;

public class C01_If {

	public static void main(String[] args) {
		//Ʈ���� ��ø if��
		
		int num=0;
		String sco="";
		Scanner scan001 = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
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
	        System.out.println("����� ������ "+sco+" �Դϴ٢�");
		}else {
			System.out.println("�Է� ���� �ʰ�");
		}
		
		scan001.close();
		
			
					
	
		
		

	}

}
