package test200715;

public class StudentMain {

	public static void main(String[] args) {
		
		Student student_1 = new Student();
		student_1.name = "������";
		student_1.adress = "����";
		student_1.hobby = "�";
		student_1.s = "����";
		student_1.age = 23;
		System.out.print(student_1.name+"|");
		System.out.print(student_1.adress+"|");
		System.out.print(student_1.hobby+"|");
		System.out.print(student_1.s+"|");
		System.out.println(student_1.age);
		
		Student student_2 = new Student();
		System.out.println(student_2.toString());
//      Ŭ������ �Է��� ��� �޼ҵ带 �̿��� ��
		
		Student student_3 = new Student("�����","����","�丮",29);
		System.out.print(student_3.name+"|");
		System.out.print(student_3.adress+"|");
		System.out.print(student_3.hobby+"|");
		System.out.print(student_3.s+"|");
		System.out.print(student_3.age);

	}

}
