package test200716_class3;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {

//��ü�� ������ �ʵ尪�� Ȱ���ϴ� ���� Ŭ����		
		
		Scanner scan = new Scanner(System.in);
		boolean end = true;
		
		String name = "";
		String adress = "";
		String phone = "";
		int menu = 0 ;
		
		Student stu = null; //��ü�� �̸��� �����س��� ��
		Application app = new Application();
		StudentDTO stuD = null;
		
		
		while (end) {
			System.out.println("--------------------------------------------------------------------");
			System.out.println("1.�űԵ�� | 2.�⼮üũ | 3.����Ȯ�� | 4.�������� | 5.���� | 6.DTOŬ������ �̿��� ��ü");
			System.out.println("--------------------------------------------------------------------");
			
			System.out.print("���� > ");
			menu = scan.nextInt();
			
			if (menu == 1) {
				System.out.print("�̸� : ");
				name = scan.next();
				System.out.print("�ּ� : ");
				adress = scan.next();
				System.out.print("��ȭ��ȣ : ");
				phone = scan.next();
				stu = new Student(name,adress,phone);				
			}else if (menu == 2) {
				app.enter(stu);
			}else if (menu == 3) {
				//app.info(stu);
				app.info_1(stu);
			}else if (menu == 4) {
				app.change(stu);
			}else if (menu == 6){
				System.out.print("�̸� : ");
				name = scan.next();
				System.out.print("�ּ� : ");
				adress = scan.next();
				System.out.print("��ȭ��ȣ : ");
				phone = scan.next();
				stuD = new StudentDTO();
				stuD.setName(name);
				stuD.setAdress(adress);
				stuD.setPhone(phone);
			}
			
			
		}
		
		stuD.setName("ȸ��1"); // ���� �޼ҵ带 �̿��Ͽ� �ʵ� �� ����
		System.out.println(stuD.getName()); // ���� �޼ҵ带 �̿��Ͽ� name �ʵ� ���� ���
		
		scan.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
