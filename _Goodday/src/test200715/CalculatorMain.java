package test200715;

public class CalculatorMain {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		cal.sum(100, 100);
		
		int val1 = 100;
		int val2 = 20;
		cal.sum(val1, val2);
//매개값에 메인 클래스에서 정의한 변수도 올 수 있지만 메소드에서 정의한 타입과 같아야 함 
		
		cal.sum0(5, 15);
//cal.sum 메소드는 클래스에서 출력까지 메소드로 정의했기 때문에 
//바로 출력이 되었지만 cal.sum0은 리턴만 된 상태라 자동 출력은 되지 않음
//cal.sum0자체가 20이 된 것
		
		int see = cal.sum0(5, 15);
		System.out.println(see);
		

		


	}

}
