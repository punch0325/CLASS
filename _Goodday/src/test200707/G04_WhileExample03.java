package test200707;

public class G04_WhileExample03 {

	public static void main(String[] args) {
		//���� �ֻ��� �����! (6�� �Ǹ� �����ϱ�)
		
		int i = 0;
		i = 1;
		boolean stop = true;
		
		while (stop) {
			i = (int)(Math.random()*6)+1;
			System.out.println("����: "+i);
			if (i == 6) {
				stop = false;
				System.out.println(i+"�� ���Գ׿� �����մϴ�.");
			}
		}
		
//	1. while���� ������ boolŸ�� ����(true�� ����)�� ����
//	2. ���๮�� i���� ���� �޼ҵ�� 1���� 6����
//	     ���� �ݺ� �ǰ� �߻� ��Ŵ
//	3. ��� �޼ҵ带 ��� �������� ���ڰ� ��� ��
//	4. if������ i���� 6�� �Ǹ� boolŸ�� ������ ������ �ǰ� ��
//  - ���� ���� �޼ҵ尡 While�� �ۿ� ������ �������� ���ڰ�
//    �ϳ��� ��� �ǰ� ���� ������
//  - ���� �޼ҵ尡 while�� �ۿ� �ִ� ���·� while���� 
//	   �����ϸ� �������� �߻� �� �ϳ��� ���ڸ� �ݺ��� �� 
	  
 
 
 
 
 
 
	
		
		
		
	}

}
