package test200706;

public class F06_Example05 {

	public static void main(String[] args) {
		// 4x + 5y = 60 �� �����ϴ� x,y���� ���ϱ�
		// x = 5 , y = 8
		// x = 10 , y = 4

		int x, y;
		x = 0;
		y = 0;
		
		for (x = 1; x <= 10; x++ ) {
			for (y = 1; y <= 10; y++ ) {
				if ((4*x)+(5*y)==60) {
					System.out.print("x�� :"+x+"/");
					System.out.print("y�� :"+y);
					System.out.println();
				}
			}
		}

		
		
		
		
		
		
		

	}

}
