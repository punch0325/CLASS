package test200721;

import java.util.List;
import java.util.Scanner;

public class BoardService {
	
	Scanner scan = new Scanner(System.in);
			
	public void listView(List<BoardDTO> boardList) {
		for(int i=0; i<boardList.size(); i++) {
			System.out.println(boardList.get(i));
			                   //boardList.get(0)
			                   //boardList.get(1)
                               //boardList.get(2)
                               //boardList.get(3)	
		}
	}
//case 2���� ȣ���� listView�޼ҵ�
	
	
	
	public List<BoardDTO> boardModify(List<BoardDTO> boardList) {
		System.out.print("���� �۹�ȣ : ");
		int contentsNum = scan.nextInt();
		scan.nextLine(); //���� scan.nextInt();�� ���־��� ������ �ؿ��� scan.next();�� ��Ȱ�ϰ� ���ַ��� �ѹ� ��ĳ�ʸ� ����� ��
		System.out.print("��й�ȣ : ");
		String password = scan.next();
		
		for(int i=0; i<boardList.size(); i++) {
			if(contentsNum==boardList.get(i).getContentsNum() && password.equals(boardList.get(i).getPassword())) {
			/*if�� ���� (���� ��ĳ�ʷ� �Է��� contentsNum�� ���� boardList(ArrayList�迭�̸�)��
			  getContentsNum(���� ������������ ���͸޼ҵ� ȣ��)�� �����鼭, 
			   ��ĳ�ʷ� �Է��� password�� ���� boardList�� getPassword�� ������ �����Ѵ�!)*/
				System.out.print("�������� �Է� : ");
				String contents = scan.next();
				
				boardList.get(i).setContents(contents);
				/*���͸޼ҵ带 �̿��� contents�� ���� �ٽ� contents�ʵ忡 ��� 
				  boardList��� ArrayList�迭�� �ش��ϴ� ���� contents���� ��� �Է��� contents������ �ٲ�*/
				
				/*if���� for�ݺ��� �ȿ� �־�, ���� �´� ���� ã�� �� ���� i���� �ݺ��ϸ� �����ϱ� ������
				    �� ���忡 �ִ� i�� if���ǹ��� �ִ� ���� �ݺ��ϸ� ������ �� i�� ���� ������ ���� �Է��� �۹�ȣ�� ��й�ȣ ���� ���� �ε������� 
				    �� �°� ã�� ������ �� �ִ� ����
				  */
				System.out.println("����"+contents);
				System.out.println("�����Ϸ�");
			} 
		}
		return boardList;
		//������ ������ boardListd�� ���� return���� MainŬ�������� ȣ���� case 3���� �Ѱ��� 
	}
//case 3���� ȣ���� List<BoardDTO>����Ÿ���� boardModify�޼ҵ�
	
	
	
	public List<BoardDTO> boardDelete(List<BoardDTO> boardList) {
		System.out.print("���� �۹�ȣ : ");
		int contentsNum = scan.nextInt();
		scan.nextLine();
		System.out.print("��й�ȣ : ");
		String password = scan.next();
		
		for(int i=0; i<boardList.size(); i++) {
			if(contentsNum==boardList.get(i).getContentsNum() && password.equals(boardList.get(i).getPassword())) {
			/*if���� ������ boardModify�� ����*/
				boardList.remove(i);
				/*remove�޼ҵ带 �̿��Ͽ� ���ϴ� �ε�����ȣ ���� ������ �� ����*/
				System.out.println("�����Ϸ�");
			} 
		}
		return boardList;
	}
//case 4���� ȣ���� List<BoardDTO>����Ÿ���� boardDelete�޼ҵ�
	









}
