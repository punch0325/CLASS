package test200723;

public class SmartPhone extends CellPhone {

	String type;
	
	@Override
	void powerOn() {
		System.out.println("����Ʈ���� �մϴ�.");
	}
	
	@Override
	void hangOn() {
		System.out.println("����Ʈ������ ��ȭ�� �̴ϴ�.");
	}
	
	/* SmartPhone Ŭ������ CellPhone Ŭ������ �ڽ��̱� ������ CellPhone�� �ʵ�� �޼ҵ�� ����,
	   CellPhone�� �θ� Ŭ������ Phone Ŭ������ �ʵ�� �޼ҵ� ���� ����� ������*/
}
