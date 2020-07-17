package test200714;

public class CarMain {

	public static void main(String[] args) {
		// main class(메인 클래스) 메인 메소드가 있음!
		
//		1.객체 선언 방법
//		  - '객체로 만들 클래스 이름' 변수명 = new '객체 클래스의 생성자 형식'	   
		
		Car car1 = new Car(); //Car()s는 기본 생성자라고 함
//       - car1 : 객체이기도 하면서 Car클래스 타입의 변수
//		 - Car 클래스를 car1 객체(Object)로 선언(복사)하여 		 
//         Car 클래스가 가지고 있는 필드를 사용할 수 있게 해줌
		
		//Car 클래스가 가지고 있는 color 필드에 값을 대입
		car1.color = "red";
//		car1 이라는 복사본을 만들어서 값을 지정하였기 때문에 원본인 Car 클래스는
//		아무런 영향이 없음.
		
		//car1의 color 필드가 가지고 있는 값 출력
		System.out.println(car1.color);
		
		Car car2 = new Car();
		car2.color = "blue";
		System.out.println(car1.color);
		System.out.println(car2.color);
//		각각 다른 객체를 선언(복사)하였기 때문에 이 두개의 Car클래스 타입 변수도
//		서로에게 영향을 주지 않는다
		
		String var = "";
		var = car2.color;
		System.out.println(var);
		
		Car car3 = null;
		car3 = new Car();
		//car3의 모든 필드값 출력
		System.out.println(car3.color);
		System.out.println(car3.company);
		System.out.println(car3.model);
		System.out.println(car3.speed);
		System.out.println(car3.type);
//		Car클래스에서 필드의 초기값을 지정해주지 않더라도 객체의 값은 
//		기본 초기값으로 출력 된다.
		
		//매개변수가 있는 생성자를 활용한 객체 선언
		Car car4 = new Car("김펀치고양이");
		//
		System.out.println("시작"+car4.color);
		System.out.println(car4.company);
		System.out.println(car4.model);
		System.out.println(car4.speed);
		System.out.println(car4.type);
	}

}
