package test200723_01;

public abstract class Animal { //추상 클래스
                               //추상 클래스나 메소드를 만들어주고 싶으면 abstract를 앞에 붙여줌
	                           //추상 클래스는 객체를 만들 수 없음 
	String kind;
	
	abstract void sound();
	//추상 메소드는 추상 클래스에 실행 내용 없이 이름만 선언을 해주고 활용을 해주기 위해선 부모 클래스가 되어 자식 클래스에게 상속 시켜주어야 함
	
	void breath() {
		System.out.println("숨을 쉽니다.");
	}
	//추상 클래스에 만드시 추상 메소드만 만들어야 하는 것은 아님
	
}
