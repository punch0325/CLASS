package test200702;

public class D08_Example06 {

	public static void main(String[] args) {
		// 주사위 출력하기

		int num = 0;
		String square = "";
		num = (int)(Math.random() * 6) + 1;
		/*랜덤 메소드는 0.0이상 1.0 미만의
		   값을 구해주기 때문에 6을 곱하면 0.0부터 5.0까지의
		   수를 구하게 된다 그러므로 1을 더해주면 1.0부터
		  6.0사이의 수를 발생 시킬 수 있다. 
		  (int)로 인해 형 변환을 시켜 정수로 1 부터 6이 됨*/
		
		switch (square) {
		case "" : 
			System.out.println("주사위 " + num + "이(가) 나왔습니다!");
			break;
		default :
			System.out.println("잘못 던졌습니다ㅠ^ㅠ");
			break;
		}
	
	
	
	
	}

}
