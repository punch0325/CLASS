package test200723_02;

public class StringMethod {

	public static void main(String[] args) {
	
		String str = "100";
		int num = 100;
		//int result = num + str;

		int num1 = Integer.parseInt(str); //String���� ����Ǿ� �ִ� ���� ������ ��ȯ�ϴ� �޼ҵ� ��, �ٸ� �ѱ��̳� ���� Ư�����ڴ� �ȵ�
		int result = num + num1;
		System.out.println(result);
	}

}
