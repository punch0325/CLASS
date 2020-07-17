package test200715;

public class Calculator1 {
	//메소드 이름 : add , 리턴타입 : int , 매개변수 : 정수 x y
	int add (int x, int y) {
		int result = x + y;
		return result;
	}
		
	double avg (int x , int y) {
		double sum = add(x,y); //같은 클래스 안에 있기 때문에 이름만으로도 호출이 가능
		double result = sum / 2;
		return result;
		
	}

	void execute() {
		double result = avg(7,10);
		System.out.println("실행결과" + result);
	}














}
