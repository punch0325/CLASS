package test200716;

public class Car {
	//gas 필드 선언 
	int gas;
	
	//생성자 선언
	Car (int gas) {
		this.gas = gas;
	}
	
	void setGas(int gas) {
		this.gas = gas;
	}
//위 처럼 생성자를 선언하여 써도 되고 메소드를 써도 됨!	
	
	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
	   }else {
		   System.out.println("gas가 있습니다.");
		   return true;
	   }
	}

	void run( ) {
		boolean run = true;
		while(run) {
			if (gas > 0) {
				System.out.println("달립니다. (gas 잔량 : " + gas + ")");
				gas -= 1;
			}else {
				System.out.println("멈춥니다. (gas 잔량 : " + gas + ")");
				run = false;
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
