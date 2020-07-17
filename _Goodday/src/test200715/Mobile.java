package test200715;

public class Mobile {
	
	String company = "삼성";
	String model;
	String color;
	int type;
	
	//모든 필드를 매개번수로 하는 생성자
	Mobile(String company, String model, String color, int type) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.type = type;
	}
	
	Mobile() {
		
	}
//	위에서 모든 필드를 매개변수로 하는 생성자로 만들어버려
//	메인 클래스에서 기본 생성자를 쓴 변수가 오류가 생기기 때문에
//	기본 생성자를 다시 선언해준 것
	
	

}
