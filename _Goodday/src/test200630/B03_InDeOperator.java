package test200630;

public class B03_InDeOperator {

	public static void main(String[] args) {
		int num1, num2, num3 = 0;
		num1 = 4;
		num2 = 3;
		
		System.out.println(num1);//4
		System.out.println(num3);//0
		
		num3 = num1++;
		System.out.println(num1);//5
		System.out.println(num3);//4
		/* ���������ڰ� �ڿ� ���� ��� �� ���������� 1�� ����
		     ��Ű�� ����̱� ������, num3�� ���� num1��
		     ���� ������ �ִ� 4�� ��� ����� �ǰ� �� ��
		   ���� �����ڿ� ���� num1�� 1�� ���� �Ǿ� 5�� ���
		 */
		
		num3 = ++num1;
		System.out.println(num1);//6
		System.out.println(num3);//6
		/* -���� ���� ������ num1�� ���� 5�� ��
		   ���������ڰ� �տ� ���� num1�� 1�� ���� ���� ��Ų 
		  6���� ����� �ϱ� ������ �Ȱ��� num3���� 6�� ���
	    */
		
		num3 = --num1;
		System.out.println(num1);//5
		System.out.println(num3);//5
		
		num3 = num1--;
		System.out.println(num1);//4
		System.out.println(num3);//5
		
		num3 = num1++ - num2--;
		System.out.println("����1 : "+num1);//5
		System.out.println("����1 : "+num2);//2
		System.out.println("����1 : "+num3);//1
		
		num3 = --num1 * num2--;
		System.out.println("����2 : "+num1);//4
		System.out.println("����2 : "+num2);//1
		System.out.println("����2 : "+num3);//8
		
		
	}

}
