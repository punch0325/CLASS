package test200629;

public class A05_StringGo {

	public static void main(String[] args) {
		String strVar1 = "";
		String strVar2 = null;

		strVar1 = "�̵��� �Ķ�� _ �ʿ��� �� ������ ��";
		System.out.println(strVar1);

		strVar2 = "�ڹٴ� ��̰� ���ȷ� �ִ�^^*";
		System.out.println(strVar2);

		String strVar3 = "������ �ų��� ����?";
		System.out.println(strVar3);
		System.out.println(strVar3 + "3");
		String result = "";

		result = strVar3 + strVar2;
		System.out.println(result);
		result = strVar1 + strVar2;
		System.out.println(result);
		result = strVar1 + 1.3;
		System.out.println(result);
		

	}

}
