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
			System.out.println("1.닉네임/비밀번호 입력 | 2.글쓰기 | 3.내용 확인 | 4.글쓰기 수정| 5.글쓰기삭제 | 6.종료");
			System.out.println("--------------------------------------------------------------------");
			
			System.out.print("선택 > ");
		    menuNum = scan.nextInt();
			
			switch(menuNum) {
			case 1 :
				System.out.print("닉네임 : ");
				nickName = scan.next();
				System.out.print("비밀번호 : ");
				pw = scan.next();
				break;
			case 2 :
				System.out.println("내용을 입력하세요 ");
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
				System.out.println("글쓰기가 종료되었습니다.");
				break;
			}
		}
		
		
		scan.close();
		
		
		
		
		
		

	}

}
