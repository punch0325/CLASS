package test200701;

import java.util.Scanner;

public class C03_Example01 {

	public static void main(String[] args) {
		int time = 0;
		int hour = 0;
		int min = 0;
		int sec = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("�ʸ� �Է��ϼ��� �� ");
		time = scan.nextInt();

	    hour = time/60/60; // �Ǵ� time/3600;
	    min = time/60%60;
	    sec = time%60;
		System.out.println(time + "�ʴ� " + hour+"�ð� "+min+"�� "+sec+"�� �Դϴ�.");

		scan.close();
	}

}
