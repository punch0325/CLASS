package test200629;

public class A05_StringGo {

	public static void main(String[] args) {
		String strVar1 = "";
		String strVar2 = null;

		strVar1 = "미도와 파라솔 _ 너에게 난 나에게 넌";
		System.out.println(strVar1);

		strVar2 = "자바는 재미가 증맬로 있다^^*";
		System.out.println(strVar2);

		String strVar3 = "룰루랄라 신나는 수업?";
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
