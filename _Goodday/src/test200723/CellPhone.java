package test200723;

public class CellPhone extends Phone { //�ڽ� Ŭ����
// �ڽ� Ŭ������ �̸� ���� extends �θ� Ŭ���� �̸��� ���� �θ� Ŭ������ ������ �ڽ� Ŭ������ ��� ��
	
	String button;
	String message;
	
	CellPhone(){
		
	}
	CellPhone(String button, String model, String color){
		this.button = button;
		this.model = model;
		this.color = color;
	   // model�� color �ʵ�� ���� class�� ������ ������ phone�̶�� �θ� Ŭ������ ���� model�� color �ʵ带 ��� �޾ұ� ������ �� �� ����
	}
    
	void sendMessage(String message) {
		System.out.println("�޼��� ���� : "+message);
	}
	void receiveMessage(String message) {
		System.out.println("�޼��� ���� : "+message);
	}
	void powerOn() {
		System.out.println("������ �մϴ�.");
	}
	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
	
	
	@Override
	void hangOn() {
		System.out.println("CellPhone���� ��ȭ�� �̴ϴ�.");
	}
/* - Phone(�θ� Ŭ����)�� �Ȱ��� �޼ҵ带 CellPhone(�ڽ� Ŭ����)������ �ٽ� �������� �� �ִµ�, �̰��� �޼ҵ� ������(Overriding)��� ��
   - �׷��� �θ� Ŭ���������� �޼ҵ� ������ ������� �ʰ� �ڽ� Ŭ�������� ���� ������ ������ ���� ��
   - ���� �θ� Ŭ�������� ������ ���ְ� ���� �޼ҵ��� �̸��� �ڽ� Ŭ�������� �Ǽ��� �̸� ��Ÿ�� ���� �Ǹ� �װ� �׳� �ڽ� Ŭ�������� ���ο� �޼ҵ带 
           ����� �ذͰ� �Ȱ��� �̰��� ���� �ϱ� ���ؼ� �޼ҵ� ���� @Override�� �ٿ� �ָ� ��
   - @Override�� �ٿ��ָ� �˾Ƽ� �θ� �ڽİ��� �޼ҵ带 ���� ���� �޼ҵ尡 ������ ������ ��� �˷���!!*/
	
	
	
	
	
	
	
	
	
	
	
	
}
