package test200720_01;

import java.util.*;

public class BoardService {

	Scanner scan = new Scanner(System.in);
	
	public void contentsView(List<BoardDTO> boardList) {
		for (int i = 0; i<boardList.size(); i++) {
			System.out.println("�� ��ȣ"+boardList.get(i).getContentsNum()+" : "+boardList.get(i).getContents());
		}
	}

	public void contentsModify(List<BoardDTO> boardList) {
		System.out.print("������ �� ��ȣ�� �Է����ּ��� : ");
		int contentsNum = scan.nextInt();
		System.out.print("��й�ȣ�� �Է����ּ��� : ");
		String pw = scan.next();
		
		for (int i = 0; i<boardList.size(); i++) {
			if(pw.equals(boardList.get(i).getPw()) && contentsNum == boardList.get(i).getContentsNum()) {
				System.out.print("���� ���� > ");
				String contents = scan.next();
				boardList.get(i).setContents(contents);
				System.out.println("���� �Ϸᢾ");
			}	
		}
	}

	public void contentsDelete(List<BoardDTO> boardList) {
		System.out.print("������ �� ��ȣ�� �Է����ּ��� : ");
		int contentsNum = scan.nextInt();
		System.out.print("��й�ȣ�� �Է����ּ��� : ");
		String pw = scan.next();
		
		for (int i = 0; i<boardList.size(); i++) {
			if(pw.equals(boardList.get(i).getPw()) && contentsNum == boardList.get(i).getContentsNum()) {
				boardList.remove(i);
				System.out.println("���� �Ϸᢾ");
			}	
		}
		
	}

	


	
	
	
	
	
	
	
	
}
