package test200708;


public class H02_DoWhileExample02 {

	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 0;
		int sum = 0;
		int s = 1;
		boolean end = true;
		
		do {
			sum = sum+num2;
			
			 if (sum >= 100) {
				 end = false;
			}else {
				num2 = s*num1;
				s = -s;
				num1++;	
				System.out.print("num2 값 : "+num2);
				System.out.println("\tnum1 값 : "+num1);
			}
			 
		}while (end);
		
		System.out.println();
		System.out.println("합계 : "+sum);
		System.out.println("마지막 : "+num2);
		
	
		
		
		
		
		
		
		
		
	}

}
