package test200706;

public class F06_Example05 {

	public static void main(String[] args) {
		// 4x + 5y = 60 을 만족하는 x,y값을 구하기
		// x = 5 , y = 8
		// x = 10 , y = 4

		int x, y;
		x = 0;
		y = 0;
		
		for (x = 1; x <= 10; x++ ) {
			for (y = 1; y <= 10; y++ ) {
				if ((4*x)+(5*y)==60) {
					System.out.print("x값 :"+x+"/");
					System.out.print("y값 :"+y);
					System.out.println();
				}
			}
		}

		
		
		
		
		
		
		

	}

}
