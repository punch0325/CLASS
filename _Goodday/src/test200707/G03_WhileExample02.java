package test200707;

public class G03_WhileExample02 {

	public static void main(String[] args) {
		// while ������ ���� �ݺ��ϱ�
        // i���� 99�� �� �ݺ��� �����ϱ�
		int i = 0;
		i = 1;
		boolean stop = true;
		// boolean Ÿ�� ������ if���� �̿��Ͽ�
		// 99�� �Ǹ�, ���ǿ� �ִ� boolean������ ��������
		// �ٲپ� ���߰� �ϴ� ���

		while (stop) {
			System.out.println(i);
			i++; 
			if (i==99) {
				stop = false;
			}
		}
		System.out.println("�ݺ��� ����");
		/* 1. ���๮{}�� ������� ����ȴٴ� ���� ������ ��!!
		 * 2. ù ���� ���� 1�� ���� ��� ��
		 * 3. if�� ������ ����ϸ� ���������� �������� 2�� ��
		 * 4. while�� ������ boolean ������ ���� true��
		 *    �����߱� ������ �����̵� ���� �ݺ��� ����
		 * 5. �ٽ� 2�� ��� �ϰ� if���� ����ϸ� ����������
		 *    ���� ���� 3�� �Ǵ� ������ ��� �ݺ��ϴٰ�,
		 * 6. 99�� ���� �� ����� ���� �� �Ŀ�
		 *    if�� ���ǿ� �ɷ� while���� ������ false�� �Ǹ�
		 *    �ݺ����� ����� */

	
	
	
	}

}