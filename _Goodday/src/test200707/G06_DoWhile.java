package test200707;

public class G06_DoWhile {

	public static void main(String[] args) {
//		do {
//			반복 실행 내용
//		}while (반복 조건);

		int i = 10;
		boolean stop = true;
		System.out.println("반복문 시작");
		do {
			System.out.println(i);
			if (i == 20) {
				stop = false;
				System.out.println("20이 되었습니다.");
			}
			i++;
		} while (stop);
		System.out.println("반복문 종료");

	}

}
