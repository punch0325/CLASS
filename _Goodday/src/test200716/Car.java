package test200716;

public class Car {
	//gas �ʵ� ���� 
	int gas;
	
	//������ ����
	Car (int gas) {
		this.gas = gas;
	}
	
	void setGas(int gas) {
		this.gas = gas;
	}
//�� ó�� �����ڸ� �����Ͽ� �ᵵ �ǰ� �޼ҵ带 �ᵵ ��!	
	
	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("gas�� �����ϴ�.");
			return false;
	   }else {
		   System.out.println("gas�� �ֽ��ϴ�.");
		   return true;
	   }
	}

	void run( ) {
		boolean run = true;
		while(run) {
			if (gas > 0) {
				System.out.println("�޸��ϴ�. (gas �ܷ� : " + gas + ")");
				gas -= 1;
			}else {
				System.out.println("����ϴ�. (gas �ܷ� : " + gas + ")");
				run = false;
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
