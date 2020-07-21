package test200720_01;

import java.util.*;

public class BoardService {

	Scanner scan = new Scanner(System.in);
	
	public void contentsView(List<BoardDTO> boardList) {
		for (int i = 0; i<boardList.size(); i++) {
			System.out.println("글 번호"+boardList.get(i).getContentsNum()+" : "+boardList.get(i).getContents());
		}
	}

	public void contentsModify(List<BoardDTO> boardList) {
		System.out.print("수정할 글 번호를 입력해주세요 : ");
		int contentsNum = scan.nextInt();
		System.out.print("비밀번호를 입력해주세요 : ");
		String pw = scan.next();
		
		for (int i = 0; i<boardList.size(); i++) {
			if(pw.equals(boardList.get(i).getPw()) && contentsNum == boardList.get(i).getContentsNum()) {
				System.out.print("수정 내용 > ");
				String contents = scan.next();
				boardList.get(i).setContents(contents);
				System.out.println("수정 완료♥");
			}	
		}
	}

	public void contentsDelete(List<BoardDTO> boardList) {
		System.out.print("삭제할 글 번호를 입력해주세요 : ");
		int contentsNum = scan.nextInt();
		System.out.print("비밀번호를 입력해주세요 : ");
		String pw = scan.next();
		
		for (int i = 0; i<boardList.size(); i++) {
			if(pw.equals(boardList.get(i).getPw()) && contentsNum == boardList.get(i).getContentsNum()) {
				boardList.remove(i);
				System.out.println("삭제 완료♥");
			}	
		}
		
	}

	


	
	
	
	
	
	
	
	
}
