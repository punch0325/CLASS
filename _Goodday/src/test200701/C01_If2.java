package test200701;

import java.util.Scanner;

public class C01_If2 {

	public static void main(String[] args) {
		int sco = 0;
		String gra = "";
		String result="";
		Scanner scan = new Scanner(System.in);
		System.out.print("�г��� �Է��Ͻÿ� : ");
		gra = scan.nextLine();
		System.out.print("������ �Է��Ͻÿ� : ");
		sco = scan.nextInt();

		if (gra.equals("1�г�")) {
			if (sco>=60) {
				result="�հ�";
			}else {
				result="���հ�";
			}
		}else if (gra.equals("2�г�")) {
			if (sco>=60) {
				result="�հ�";
			}else {
				result="���հ�";
			}
		}else if (gra.equals("3�г�")) {
			if (sco>=60) {
				result="�հ�";
			}else {
				result="���հ�";
			}
		}else if (gra.equals("4�г�")) {
			if (sco>=70) {
				result="�հ�";
			}else {
				result="���հ�";
			}
			
		}System.out.println("������� "+result+" �Դϴ�.");
		
		
        
		scan.close();
		
		
		
	}

}
