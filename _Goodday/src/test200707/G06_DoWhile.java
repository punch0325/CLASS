package test200707;

public class G06_DoWhile {

	public static void main(String[] args) {
//		do {
//			�ݺ� ���� ����
//		}while (�ݺ� ����);

		int i = 10;
		boolean stop = true;
		System.out.println("�ݺ��� ����");
		do {
			System.out.println(i);
			if (i == 20) {
				stop = false;
				System.out.println("20�� �Ǿ����ϴ�.");
			}
			i++;
		} while (stop);
		System.out.println("�ݺ��� ����");

	}

}
