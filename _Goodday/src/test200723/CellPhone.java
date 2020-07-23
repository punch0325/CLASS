package test200723;

public class CellPhone extends Phone { //자식 클래스
// 자식 클래스의 이름 옆에 extends 부모 클래스 이름을 쓰면 부모 클래스의 정보가 자식 클래스에 상속 됨
	
	String button;
	String message;
	
	CellPhone(){
		
	}
	CellPhone(String button, String model, String color){
		this.button = button;
		this.model = model;
		this.color = color;
	   // model과 color 필드는 현재 class에 있지는 않지만 phone이라는 부모 클래스로 부터 model과 color 필드를 상속 받았기 때문에 쓸 수 있음
	}
    
	void sendMessage(String message) {
		System.out.println("메세지 전송 : "+message);
	}
	void receiveMessage(String message) {
		System.out.println("메세지 수신 : "+message);
	}
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	
	@Override
	void hangOn() {
		System.out.println("CellPhone으로 전화를 겁니다.");
	}
/* - Phone(부모 클래스)의 똑같은 메소드를 CellPhone(자식 클래스)에서도 다시 선언해줄 수 있는데, 이것을 메소드 재정의(Overriding)라고 함
   - 그러면 부모 클래스에서의 메소드 내용이 실행되지 않고 자식 클래스에서 새로 정의한 내용이 실행 됨
   - 만약 부모 클래스에서 재정의 해주고 싶은 메소드의 이름을 자식 클래스에서 실수로 이름 오타를 내게 되면 그건 그냥 자식 클래스에서 새로운 메소드를 
           만들어 준것과 똑같음 이것을 방지 하기 위해서 메소드 위에 @Override를 붙여 주면 됨
   - @Override를 붙여주면 알아서 부모 자식간의 메소드를 비교해 같은 메소드가 없으면 오류를 띄워 알려줌!!*/
	
	
	
	
	
	
	
	
	
	
	
	
}
