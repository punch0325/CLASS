package test200707;

public class G05_WhoileExample04 {

	public static void main(String[] args) {
		// 주사위를 2개 던져 그 합이 6이 되면 종료!
		
		int num1 = 0;
		int num2 = 0;
		num1 = 1;
		num2 = 1;
		boolean stop = true;
		
		while (stop) {
			num1 = (int)(Math.random()*6)+1;
			num2 = (int)(Math.random()*6)+1;
			System.out.print("주사위■:"+num1);
			System.out.println("  주사위□:"+num2);
			if ((num1+num2)==6) {
				stop = false;
				System.out.println("총합 6이 나왔습니다. 성공입니다.");
		   }
		   
		}

		
		
		
		
	}

}
