package test200723;

public class SmartPhone extends CellPhone {

	String type;
	
	@Override
	void powerOn() {
		System.out.println("스마트폰을 켭니다.");
	}
	
	@Override
	void hangOn() {
		System.out.println("스마트폰으로 전화를 겁니다.");
	}
	
	/* SmartPhone 클래스는 CellPhone 클래스의 자식이기 때문에 CellPhone의 필드와 메소드는 물론,
	   CellPhone의 부모 클래스인 Phone 클래스의 필드와 메소드 까지 사용이 가능함*/
}
