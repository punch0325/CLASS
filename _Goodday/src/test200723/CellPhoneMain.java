package test200723;

public class CellPhoneMain {

	public static void main(String[] args) {
		
		CellPhone cp = new CellPhone();
		
		cp.button ="버튼 10개";
		cp.color = "red";
		cp.message = "메시지";
		cp.model = "전화기";
		cp.hangOn();
		cp.hangOff();
		cp.sendMessage("안녕");
	// CellPhone(자식 클래스)클래스의 객체만 선언했더라도 Phone(부모 클레스)에서 상속을 받았기 때문에 Phone의 모든 필드 사용, 메소드 호출이 가능  
		
		SmartPhone sp = new SmartPhone();
		sp.button = "터치스크린";
		sp.color = "silver";
		sp.message = "카톡";
		sp.model = "아이폰";
		sp.type = "LTE";
		sp.call("여보세요");
		sp.hangOff();
		sp.hangOn();
		sp.powerOff();
		sp.powerOn();
		sp.receiveMessage("안녕");
	
		
	
	
	
	
	
	
	
	
	
	}

}
