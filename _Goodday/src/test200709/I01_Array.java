package test200709;

public class I01_Array {

	public static void main(String[] args) {
		
	
		//������ �迭 ������ �����ϸ� �ʱ� �� ����
		int[] number3 = {1,2,3,4};
//		�ε��� ��ȣ�� �� 3���� ����
//		0�� �ε��� = 1 / 1�� �ε��� = 2 / 2�� �ε��� =3 /
//		3�� �ε��� =4 

		System.out.println(number3[0]);
		System.out.println(number3[1]);
		System.out.println(number3[2]);
		System.out.println(number3[3]);
		
		//String Ÿ�� �迭�� �����Ͽ� ���� �ٿ� ����
		//4���� �̸��� �����ϰ� ���
		String[] name = {"����","����","����","����"};
		
		String change = "";
		change = "�ӳ�";
		name[1] = change;
		name[3] = "��ġ";
		/* ���Ͱ� ���������� ����� ���� ������ ���� ���̱�
		 ������ �� ��� ó�� �ʱ� ���� ������ �ٸ� ������ 
		 �ٲپ ����� ������ */
		
		System.out.print(name[0]+"|");
		System.out.print(name[1]+"|");
		System.out.print(name[2]+"|");
		System.out.println(name[3]+"|");
		
		//�迭�� ũ�� ���� ����ϴ� �޼ҵ�
		System.out.println(name.length);
		
		//for���� �̿��� �迭�� ����� �� ��� ���
		for (int i=0; i<name.length; i++) {
			System.out.print(name[i]+"|");
		}

		//�迭�� �ʱⰪ�� �����ϴ� ��
		int[] num1;
		num1 = new int[10];
		System.out.println("\n"+num1.length);
		
		int[] num2 = new int[3];
		System.out.println(num2.length);
		System.out.println();
		for (int i = 0; i<num2.length; i++) {
			System.out.println(num2[i]);
		}
	
	
	
	}

}
