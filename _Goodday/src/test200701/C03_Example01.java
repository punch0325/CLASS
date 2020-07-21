package test200701;

import java.util.Scanner;

public class C03_Example01 {

	public static void main(String[] args) {
		int time = 0;
		int hour = 0;
		int min = 0;
		int sec = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("초를 입력하세요 ☞ ");
		time = scan.nextInt();

	    hour = time/60/60; // 또는 time/3600;
	    min = time/60%60;
	    sec = time%60;
		System.out.println(time + "초는 " + hour+"시간 "+min+"분 "+sec+"초 입니다.");

		scan.close();
	}

}
