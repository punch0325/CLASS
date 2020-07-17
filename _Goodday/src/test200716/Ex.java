package test200716;

import java.util.Scanner;

public class Ex {
	
	Scanner scan = new Scanner(System.in);
	
	int menu;
	int num1;
	int num2;
	
	void calculator() {
		boolean end = true;
		
		while (end ) {
			System.out.println("-------------------------------------");
			System.out.println("1.µ¡¼À | 2.»¬¼À | 3.°ö¼À | 4.³ª´°¼À | 5.Á¾·á");
			System.out.println("-------------------------------------");
			
			System.out.print("¼±ÅÃ > ");
			menu = scan.nextInt();
			
			if (menu == 1) {
				System.out.print("¼ýÀÚ ÀÔ·Â : ");
				num1 = scan.nextInt();
				System.out.print("¼ýÀÚ ÀÔ·Â : ");
				num2 = scan.nextInt();
				int sum = num1+num2;
				System.out.println("µ¡¼À °á°ú : "+sum);
				
			}else if (menu == 2) {
				System.out.print("¼ýÀÚ ÀÔ·Â : ");
				num1 = scan.nextInt();
				System.out.print("¼ýÀÚ ÀÔ·Â : ");
				num2 = scan.nextInt();
				int minus = num1-num2;
				System.out.println("µ¡¼À °á°ú : "+minus);
				
			}else if (menu == 3) {
				System.out.print("¼ýÀÚ ÀÔ·Â : ");
				num1 = scan.nextInt();
				System.out.print("¼ýÀÚ ÀÔ·Â : ");
				num2 = scan.nextInt();
				int multiply = num1*num2;
				System.out.println("µ¡¼À °á°ú : "+multiply);
				
			}else if (menu == 4) {
				System.out.print("¼ýÀÚ ÀÔ·Â : ");
				num1 = scan.nextInt();
				System.out.print("¼ýÀÚ ÀÔ·Â : ");
				num2 = scan.nextInt();
				int division = num1/num2;
				System.out.println("µ¡¼À °á°ú : "+division);
				
			}else if (menu == 5){
				end = false;
				System.out.println("°è»ê Á¾·á");
				
			}else {
				System.out.println("¸Þ´º ¼±ÅÃÀ» ´Ù½ÃÇØÁÖ¼¼¿ä");
			
			}
		}
		
	}
	

}
