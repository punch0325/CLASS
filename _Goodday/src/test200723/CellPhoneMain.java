package test200723;

public class CellPhoneMain {

	public static void main(String[] args) {
		
		CellPhone cp = new CellPhone();
		
		cp.button ="��ư 10��";
		cp.color = "red";
		cp.message = "�޽���";
		cp.model = "��ȭ��";
		cp.hangOn();
		cp.hangOff();
		cp.sendMessage("�ȳ�");
	// CellPhone(�ڽ� Ŭ����)Ŭ������ ��ü�� �����ߴ��� Phone(�θ� Ŭ����)���� ����� �޾ұ� ������ Phone�� ��� �ʵ� ���, �޼ҵ� ȣ���� ����  
		
		SmartPhone sp = new SmartPhone();
		sp.button = "��ġ��ũ��";
		sp.color = "silver";
		sp.message = "ī��";
		sp.model = "������";
		sp.type = "LTE";
		sp.call("��������");
		sp.hangOff();
		sp.hangOn();
		sp.powerOff();
		sp.powerOn();
		sp.receiveMessage("�ȳ�");
	
		
	
	
	
	
	
	
	
	
	
	}

}
