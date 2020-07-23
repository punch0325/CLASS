package test200720_01;

import java.util.*;
import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		BoardDTO board = null;
		List<BoardDTO> boardList = new ArrayList<BoardDTO>();
		BoardService boardSer = new BoardService();
		
		boolean end = true;
		int menuNum = 0;
		String nickName = "";
		String pw = "";
		String contents = "";
		
		while(end) {
			System.out.println("--------------------------------------------------------------------");
			System.out.println("1.�г���/��й�ȣ �Է� | 2.�۾��� | 3.���� Ȯ�� | 4.�۾��� ����| 5.�۾������ | 6.����");
			System.out.println("--------------------------------------------------------------------");
			
			System.out.print("���� > ");
		    menuNum = scan.nextInt();
			
			switch(menuNum) {
			case 1 :
				System.out.print("�г��� : ");
				nickName = scan.next();
				System.out.print("��й�ȣ : ");
				pw = scan.next();
				break;
			case 2 :
				System.out.println("������ �Է��ϼ��� ");
				System.out.print("> ");
				contents = scan.next();
				int contentsNum = boardList.size()+1;
				
				board = new BoardDTO();
				board.setNickName(nickName);
				board.setPw(pw);
				board.setContents(contents);
				board.setContentsNum(contentsNum);
				
				boardList.add(board);
				break;
			case 3 :
				boardSer.contentsView(boardList);
				break;
			case 4 :
				boardSer.contentsModify(boardList);
				break;
			case 5 :
				boardSer.contentsDelete(boardList);
				break;
			case 6 :
				end = false;
				System.out.println("�۾��Ⱑ ����Ǿ����ϴ�.");
				break;
			}
		}
		
		
		scan.close();
		
		
		
		
		
		

	}

}
