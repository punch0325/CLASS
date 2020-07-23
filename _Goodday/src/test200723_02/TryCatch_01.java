package test200723_02;

import java.util.*;

public class TryCatch_01 {

	public static void main(String[] args) {
		/* ���� ó�� (try ~ catch ~ finally)
		   - Exception ������ �� �� ���� ó���� ���ִ� ��
		   - try �߰�ȣ{} �ȿ� �ִ� ���� ������� ������ �ǰ� ���� ��, catch �Ұ�ȣ() �ȿ� �ִ� Exception ������ ������ �߻��Ѵٸ�
		     catch ���ȣ{}�� �ִ� ���� ������ �����ϰڴٴ� ��
		   - finally�� �� ���� �ְ� �� �� ���� ����
		   - finally�� �� ���� ������ ���� ������ ���� �ʴ��� ������ ���� ��
		 */
		
		List<String> list = new ArrayList<String>();
		list.add("aaa");
		try{
			for (int i = 0; i<=list.size(); i++) {
				System.out.println(list.get(i));
				/*���� �� for���� ���� i���� ArrayList �迭�� ũ�� �̸��� �� ������ �ݺ� �Ǿ�� �ϴµ�
				    ���Ϸ� ���� �Ǿ� �־ �߰��� Exception ������ ���� ���߰� �� �� */
			}
		}catch(IndexOutOfBoundsException e) {
			System.out.println("����Ʈ ũ�� �ʰ��߽��ϴ�.");
			e.printStackTrace(); // ���� �޼����� ���� ������ְڴٴ� �޼ҵ�
		}finally {
			System.out.println("����� ������ ���Ϳ�");
		}
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
