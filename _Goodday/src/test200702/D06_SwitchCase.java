package test200702;

public class D06_SwitchCase {

	public static void main(String[] args) {
		
		/*
		 * switch case ��
		 * switch(���Ǻ���) {
		 * 
		 * case ������:
		 *    �ش� ������ ���� �� �����ϴ� ����;
		 *    break;(������ �����ִ� ���)
		 * case ������
		 *    �ش� ������ ���� �� �����ϴ� ����;
		 *    break;
		 * ~~~~~~~(case �������� ��� �߰� ����)
		 * default(if������ else���� ����) :
		 *    ��� ���ǵ� �������� ������ �� ����;
		 *    break;
		 * }
		 */
		
		int num = 2;
		switch(num) {
		case 0 :
			System.out.println("num ���� 0�Դϴ�.");
			break;
		case 1 :
			System.out.println("num ���� 1�Դϴ�.");
			break;
		case 2 :
			System.out.println("num ���� 2�Դϴ�.");
			break;
		default : 
			System.out.println("���ڰ� �ƴմϴ�.");
			break ;
		}

	}

}
