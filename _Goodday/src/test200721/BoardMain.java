package test200721;

import java.util.*;
import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		
		List<BoardDTO> boardList = new ArrayList<BoardDTO>(); //������ ���� BoardDTOŸ���� ArrayList�迭 ��ü�� ����
		BoardDTO board = null; //BoardDTO�� �ʵ带 Ȱ���� �� �ִ� ��ü�� �̸��� ����
		BoardService boardService = new BoardService(); //�޼ҵ带 Ȱ���� BoardService�� ��ü�� ����
		
		while(run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.�۾��� | 2.��ü ��� | 3.�ۼ��� | 4.�ۻ��� | 5.����");
			System.out.println("----------------------------------------------");
			System.out.print("����> ");
			int selectNo = scan.nextInt();
			
			switch(selectNo) {
			case 1:
				System.out.print("���� : ");
				String title = scan.next();
				System.out.print("���� : ");
				String contents = scan.next();
				System.out.print("��й�ȣ : ");
				String password = scan.next();
				
				board = new BoardDTO();
				board.setTitle(title);
				board.setContents(contents);
				board.setPassword(password);
				/*�ݺ����� ���� ������ ���� ���� ���� �ʵ��� �ݺ��� �ȿ� �⺻�����ڷ� ��ü ������ ���ְ� 
				���͸� �̿��Ͽ� ��ĳ�� ����  DTOŬ������ �Ű����� �����ڷ� �Ѱ��ָ鼭 �ʵ忡 ���� */
	
				int contentsNum = boardList.size() + 1;
				board.setContentsNum(contentsNum);
				/*-�ݺ����� ���ư��� �Է��� ������ ArrayList�� �ε��� ��ȣ�� �ϳ��� �þ�� ���� �̿��� contentsNum�� ���� ����
				  -1�� ������ ���� �ε��� ��ȣ�� 0���� �����ϱ� ������
				  -�׸��� ���͸� �̿��� contentsNum �ʵ忡 contentsNum������ ��ĳ�� ���� ��������*/
				
				boardList.add(board);
				//���� board�� ��� �Է� ���� ���� ArrayList�� �߰�����
				break;
			case 2:
				boardService.listView(boardList);
				//boardServiceŬ������ listView��� �޼ҵ忡 boardList��� �Ű����� �־ ȣ������
				break;
			case 3:
				boardList = boardService.boardModify(boardList);
				/*boardServiceŬ������ boardModify��� �޼ҵ忡 boardList��� �Ű����� �־� 
				ȣ������ ���� boardList(ArrayList�迭)�� �־���!*/
				break;
			case 4: 
				boardList = boardService.boardDelete(boardList);
				/*boardServiceŬ������ boardDelete��� �޼ҵ忡 boardList��� �Ű����� �־� 
				ȣ������ ���� boardList(ArrayList�迭)�� �־���!*/
				break;
			}
		}
		
		
		scan.close();
	
		
		
		
	}

}
