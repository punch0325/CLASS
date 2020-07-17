package test200716_class3;

import java.util.*;

public class ArrayList_Ex {

	public static void main(String[] args) {
		/*
		 * ArrayList
		 * index��ȣ�� ������ ����
		 * ũ�� ������ ���� ���� ���� �ִ´�� ũ�Ⱑ �þ 
		 * �߰��� ������ ���� ���� ���� �� ���� (���� �ִ� ������ �� ���� �ε��� ��ȣ�� �з����� ��) 
		 */
		
		List<Integer> numbers = new ArrayList<Integer>();
		List<String> str = new ArrayList<String>();
		List<StudentDTO> stuL = new ArrayList<StudentDTO>();
		// <> : ���׸�(generic)
		// Ÿ�Ժ�ȯ�� ���� �ʰ� �ش� Ÿ���� ����� �� �ְ� ����
		// ���׸� �ȿ��� Ŭ����Ÿ���� �;���
		// ex) Integer(������ ���� �� �ִ� Ŭ����) , String , StudentDTO(���� ���� Ŭ����)
		
		numbers.add(10);
		      //add : ������ �߰� �޼ҵ�
		int num = 100;
		numbers.add(num);
		numbers.add(30);
		numbers.add(60);
		numbers.add(-1);
		numbers.add(0, 101); //0�� �ε����� 101 �̶�� ���� ��������
		numbers.add(0, 12);
		
//		numbers.clear();
		       //clear : ��ü �����͸� �������ִ� �޼ҵ�
		numbers.remove(2);
		       //remove : ���ϴ� �ε��� ��ȣ ���� �ϳ� �����ִ� �޼ҵ�
		       //         �ڵ����� �ε��� ��ȣ�� ���� ��������
		
		System.out.println(numbers);
		System.out.println(numbers.get(0));
		System.out.println(numbers.get(1));

		System.out.println(numbers.size());
		                         //size : ArrayList�� ũ�⸦ �˷��ִ� �޼ҵ�
		

		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(i+"�� �ε��� �� : "+numbers.get(i));
		}
		
		str.add("�ȳ�ȳ�!");
		String word = "����ġ�� �ٱ��ʳ�";
		str.add(word);
		str.add("��ġ�� 5���̴�");
		str.add("��ġ�� ���� ������̴�");
		str.add(1, "������� ����̸� Ű���");
		str.add(2, "������ Ű��� ������� �̸��� ����ġ�̴�");
		
		str.remove(0);
		
		System.out.println("__________________________");
		for (int i = 0; i < str.size(); i++) {
			System.out.println(i+"�� �ε��� �� : "+str.get(i));
		}
		
		StudentDTO stuD1 = new StudentDTO();
		StudentDTO stuD2 = new StudentDTO();
		
		stuD1.setName("ȸ��1");
		stuD1.setAdress("��õ������");
		stuD1.setPhone("010-1234-5678");
		stuL.add(stuD1); // stuL
		
		System.out.println(stuL.get(0)); 
		//stuD�� ������ �̸��� ��µǴ� ��, ������ ���� StudentDTO�� tostring�޼ҵ尡 �ִٸ� ��ü ���� ���
		System.out.println(stuL.get(0).getName());
		
		stuD2.setName("ȸ��2");
		stuD2.setAdress("��⵵��õ��");
		stuD2.setPhone("000-0000-0000");
		stuL.add(stuD2);
		System.out.println(stuL.get(1).getName());
		
		for (int i = 0; i < stuL.size(); i++ ) {
			System.out.println("��ü ��� : "+stuL.get(i));
			System.out.println("�̸� ��� : "+stuL.get(i).getName());
		}
		

	}

}
