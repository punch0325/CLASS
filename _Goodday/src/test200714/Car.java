package test200714;

public class Car {

	/*class(클래스) 메인 메소드가 없음!
	 클래스의 3요소
	 1.필드(field)
	   - 데이터를 저장하기 위한 공간
	   - 변수와 비슷한 개념
	 2.생성자(constructor)  
	   - 객체를 만들 때 따라야 하는 규칙을 정의
	   - 생성자는 여러개 만들 수 있음
	   - 생성자는 매개변수가 있을 수도 있고 없을 수도 있음
	   - 생성자의 이름은 클래스 이름과 동일해야 함 
	   */
	    
	String color;
	int speed;
	String type;
	String model;
	String company = "삼성";
	//class에서는 필드라고 함
	
	//기본 생성자 선언
	Car() {
		//기본 생성자는 굳이 선언해주지 않아도 객체 선언할 때 상관없음
	}
	
	//매개변수가 있는 생성자 선언
	//매개변수 : model
	Car(String model) {
		this.model = model;
	   //this.는 현재 클래스를 뜻함 즉, this.model은 model필드라는 것
	}
	
	
	
	
	
	
	
	
	
	
	
}
