package test200707;

import java.util.Scanner;

public class G08_DoWhileExample02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = 0;
		boolean stop = true;

		do {
			System.out.print("���ڸ� �Է��ϼ��� �� ");
			num = scan.nextInt();

			if (num == 0) {
				stop = false;
				System.out.println("����! �Է� �Ұ� �Դϴ٢�");
			}else if ((num % 2) == 0) {
				System.out.println("¦����");
				System.out.println();
			}else if ((num % 2) != 0) {
				System.out.println("Ȧ����");	
				System.out.println();
			}
		} while (stop);

		scan.close();
		
	}

}
