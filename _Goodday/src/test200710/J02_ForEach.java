package test200710;

public class J02_ForEach {

	public static void main(String[] args) {
		// advanced for (���� for)
		// for each
		
		int[] num = {1,2,3,4,5};
		
		for (int i:num) {
			//int a��  �ݺ� ����
			//num�ڸ��� �ݺ� ����� ��
			System.out.println(i);
		}
//      a�� num �迭 ���� ���ʴ�� ���� �Ǿ� ��� �ǰ�,
//      num �迭 ���� �� �ݺ� �ǰ� ���� �ڵ����� ���� ��
		
		String[] any = {"�츮","��","�����","�̸���","��ġ�̴�"
		};
		
		for (String j:any) {
			System.out.print(j);
		}
		
		
		
	}

}
