package test200714;

import java.util.Scanner;

public class L02_Example1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean end = true;
		int menuNum = 0;
		int[] studentNum = null;
		int size = 0;
		int i = 0;
		int j = 0;
		int max = 0;
		int sum = 0;
		int array = 0;
		int count = 0;
		
		do {
			System.out.println("-----------------------------------------------------");
			System.out.println("1.학생 수 | 2.점수 입력 | 3.점수 리스트 | 4.분석 | 5.종료 ");
			System.out.println("-----------------------------------------------------");

			System.out.print("번호 선택 ▶ ");
			menuNum = scan.nextInt();

			if (menuNum == 1) {
				System.out.print("학생 수 입력 : ");
				size = scan.nextInt();
				studentNum = new int[size];
				System.out.println();
			}else if (menuNum == 2) {
				for (i = 0; i < studentNum.length; i++) {
					System.out.print((i + 1) + "번 째 학생 점수 입력 : ");
					studentNum[i] = scan.nextInt();
				}
				System.out.println();
			}else if (menuNum == 3) {
				for (i = 0; i < studentNum.length; i++) {
					System.out.println((i + 1) + "번 째 학생 점수 : " + studentNum[i]);
				}
				System.out.println();
			}else if (menuNum == 4) {
				for (i = 0; i < studentNum.length; i++) {
					sum = sum + studentNum[i];
					count++;
					if (max<studentNum[i]) {
						max = studentNum[i];
					}				
				} 
				System.out.println("최고 점수 : "+max);
				System.out.println("평균 점수 : "+(sum/count));
				
				System.out.println("내림 차순 : ");
				for (i = 0; i < studentNum.length; i++) {
					for (j = i+1; j < studentNum.length; j++) {
						if (studentNum[i]<studentNum[j]) {
							array = studentNum[i];
							studentNum[i] = studentNum[j];
							studentNum[j] = array;
						}
					}
					System.out.println(studentNum[i]);
				}
				System.out.println();
			}else if (menuNum == 5) {
				end = false;
				System.out.println("※프로그램을 종료하였습니다※");
			}else {
				System.out.println("번호를 잘못 선택하였습니다. 다시 선택하세요.");
				System.out.println();
			}

		} while (end);

	}

}
