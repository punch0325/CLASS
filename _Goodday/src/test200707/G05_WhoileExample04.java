package test200707;

public class G05_WhoileExample04 {

	public static void main(String[] args) {
		// �ֻ����� 2�� ���� �� ���� 6�� �Ǹ� ����!
		
		int num1 = 0;
		int num2 = 0;
		num1 = 1;
		num2 = 1;
		boolean stop = true;
		
		while (stop) {
			num1 = (int)(Math.random()*6)+1;
			num2 = (int)(Math.random()*6)+1;
			System.out.print("�ֻ�����:"+num1);
			System.out.println("  �ֻ�����:"+num2);
			if ((num1+num2)==6) {
				stop = false;
				System.out.println("���� 6�� ���Խ��ϴ�. �����Դϴ�.");
		   }
		   
		}

		
		
		
		
	}

}
