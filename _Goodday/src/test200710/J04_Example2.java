package test200710;

import java.util.Scanner;

public class J04_Example2 {

	public static void main(String[] args) {
		// 거스름돈 동전 계산기 만들어보셈여-★^_^ㅋ
		
		Scanner scan = new Scanner(System.in);
		
		int wallet[] = {500,100,50,10};
		int money = 0;
		int value = 0;
		int remainder = 0;
		boolean end = true;
		
		
//		System.out.print("거스름 돈을 입력하세요 : ");
//		money = scan.nextInt();
//		
//		value = money / wallet[0];
//		remainder = money % wallet[0];
//		System.out.println(wallet[0]+"원 동전 "+value+"개");
//		
//		value = remainder / wallet[1];
//		remainder = remainder % wallet[1];
//		System.out.println(wallet[1]+"원 동전 "+value+"개");
//		
//		value = remainder / wallet[2];
//		remainder = remainder % wallet[2];
//		System.out.println(wallet[2]+"원 동전 "+value+"개");
//		
//		value = remainder / wallet[3];
//		remainder = remainder % wallet[3];
//		System.out.println(wallet[3]+"원 동전 "+value+"개");
//		
		
		while(end) {
			System.out.print("거스름 돈을 입력하세요 : ");
			money = scan.nextInt();
			if (money==0) {
				end = false;
				System.out.println("계산 끄-읕-!★");
			}else {
				for (int i = 0; i<wallet.length; i++) {
					value = money / wallet[i];
					remainder = money % wallet[i];
					System.out.println(wallet[i]+"원 동전 "+value+"개");
					money = remainder;
				}System.out.println();
			}
		}
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
