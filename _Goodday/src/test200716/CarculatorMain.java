package test200716;

import java.util.Scanner;

public class CarculatorMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Calculator cal = new Calculator();
		
		boolean end = true;
		
		while(end) {
			System.out.println("-------------------------------------");
			System.out.println("1.µ°º¿ | 2.ª¨º¿ | 3.∞ˆº¿ | 4.≥™¥∞º¿ | 5.¡æ∑·");
			System.out.println("-------------------------------------");
			
			System.out.print("º±≈√ > ");
			int menu = scan.nextInt();
			
			if (menu == 1) {
				cal.plus();
			}else if (menu == 2) {
				cal.minus();
			}else if (menu == 3) {
				cal.multiply();
			}else if (menu == 4) {
				cal.division();
			}else if (menu == 5){
				end = false;
				System.out.println("∞ËªÍ ¡æ∑·");
			}else {
				System.out.println("∏ﬁ¥∫ º±≈√¿ª ¥ŸΩ√«ÿ¡÷ººø‰");
			}
		
		}
	scan.close();
	
	
	}

}
