package test200715;

public class NaverMain {

	public static void main(String[] args) {
		
		Naver signUp = new Naver();
		signUp.id = "wotnr0503";
		signUp.pw = "woxn1100";
		signUp.pwCheck = "woxn1100";
		signUp.name = "������";
		signUp.birth = 970127;
		signUp.gender = '��';
		signUp.emaile = "a2k7ee@naver.com";
		signUp.phone = "010-6621-2471";
		System.out.println(signUp.toString());
		
		Naver sign = new Naver("jjun1","dmsql1","dmsql1","���ؼ�",911026,'��',"��","010-5561-4368","��⵵ ���ֽ�");
		System.out.println(sign.toString());

	}

}
