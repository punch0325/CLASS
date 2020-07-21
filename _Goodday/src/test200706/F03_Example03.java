package test200706;

public class F03_Example03 {

	public static void main(String[] args) {

		// 2의 배수를 제외한 숫자의 총합!

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				sum += i;
				System.out.println(sum);
			}

		}
		System.out.println("\n" + "\t" + "최종 값 : " + sum);

	}

}
