package test200721;

import java.util.*;
import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		
		List<BoardDTO> boardList = new ArrayList<BoardDTO>(); //내용을 담을 BoardDTO타입의 ArrayList배열 객체를 선언
		BoardDTO board = null; //BoardDTO의 필드를 활용할 수 있는 객체의 이름만 선언
		BoardService boardService = new BoardService(); //메소드를 활용할 BoardService의 객체를 선언
		
		while(run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.글쓰기 | 2.전체 출력 | 3.글수정 | 4.글삭제 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택> ");
			int selectNo = scan.nextInt();
			
			switch(selectNo) {
			case 1:                        
				System.out.print("제목 : ");
				String title = scan.next();
				System.out.print("내용 : ");
				String contents = scan.next();
				System.out.print("비밀번호 : ");
				String password = scan.next();	
				int contentsNum = boardList.size() + 1;
				/*-반복문이 돌아가며 입력할 때마다 ArrayList의 인덱스 번호가 하나씩 늘어나는 것을 이용해 contentsNum에 값을 지정
				  -1을 더해준 것은 인덱스 번호가 0부터 시작하기 때문임*/
				
				board = new BoardDTO();
				board.setTitle(title);
				board.setContents(contents);
				board.setPassword(password);
				board.setContentsNum(contentsNum);
				/*반복문에 의해 마지막 값만 저장 되지 않도록 반복문 안에 기본생성자로 객체 선언을 해주고 
				세터를 이용하여 스캐너 값을  DTO클래스의 매개변수 생성자로 넘겨주면서 필드에 지정 */
				
				boardList.add(board);
				//위의 board의 모든 입력 받은 값을 ArrayList에 추가해줌
				break;
			case 2:
				boardService.listView(boardList);
				//boardService클래스의 listView라는 메소드에 boardList라는 매개값을 넣어서 호출해줌
				break;
			case 3:
				boardList = boardService.boardModify(boardList);
				/*boardService클래스의 boardModify라는 메소드에 boardList라는 매개값을 넣어 
				호출해준 것을 boardList(ArrayList배열)에 넣어줌!*/
				break;
			case 4: 
				boardList = boardService.boardDelete(boardList);
				/*boardService클래스의 boardDelete라는 메소드에 boardList라는 매개값을 넣어 
				호출해준 것을 boardList(ArrayList배열)에 넣어줌!*/
				break;
			}
		}
		
		
		scan.close();
	
		
		
		
	}

}
