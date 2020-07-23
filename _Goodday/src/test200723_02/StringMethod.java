package test200723_02;

public class StringMethod {

	public static void main(String[] args) {
	
		String str = "100";
		int num = 100;
		//int result = num + str;

		int num1 = Integer.parseInt(str); //String으로 저장되어 있는 값을 정수로 변환하는 메소드 단, 다른 한글이나 영어 특수문자는 안됨
		int result = num + num1;
		System.out.println(result);
	}

}
