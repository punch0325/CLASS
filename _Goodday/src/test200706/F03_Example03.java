package test200706;

public class F03_Example03 {

	public static void main(String[] args) {

		// 2�� ����� ������ ������ ����!

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				sum += i;
				System.out.println(sum);
			}

		}
		System.out.println("\n" + "\t" + "���� �� : " + sum);

	}

}
