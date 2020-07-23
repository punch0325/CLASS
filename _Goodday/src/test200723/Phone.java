package test200723;

public class Phone { //부모 클래스
	
	/* 상속
	  - 부모클래스의 필드, 메소드 등을 상속 받는 것
	  - 부모클래스, 자식클래스가 존재함
	  - 부모 클래스는 하나만 가능하지만 자식 클래스는 여러개 있을 수 있음
	  - 또 부모 클래스에게 상속 받은 자식 클래스가 다시 부모가 되어 또 다른 클래스에 상속해주는 것도 가능함
	  - 상속을 해준다고 부모 클래스의 필드나 메소드가 없어지는 것은 아님
	  - 
	  - 장점  1. 코드 중복을 줄일 수 있음
	        2. 유지 보수가 편리함
	        3. 객체의 다형성 구현이 가능
	  - private로 선언한 필드나 메소드는 상속 할 수 없음 
	 */
	
	String model;
	String color;
	
	void hangOn() {
		System.out.println("전화를 겁니다.");
	}
	void hangOff() {
		System.out.println("전화를 끊습니다.");
	}
	void call (String sendVoice) {
		System.out.println(sendVoice);
	}

	
}
