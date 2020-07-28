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
//case 2에서 호출한 listView메소드
	
	
	
	public List<BoardDTO> boardModify(List<BoardDTO> boardList) {
		System.out.print("수정 글번호 : ");
		int contentsNum = scan.nextInt();
		scan.nextLine(); //위에 scan.nextInt();를 해주었기 때문에 밑에서 scan.next();를 원활하게 써주려고 한번 스캐너를 비워준 것
		System.out.print("비밀번호 : ");
		String password = scan.next();
		
		for(int i=0; i<boardList.size(); i++) {
			if(contentsNum==boardList.get(i).getContentsNum() && password.equals(boardList.get(i).getPassword())) {
			/*if문 조건 (만약 스캐너로 입력한 contentsNum의 값이 boardList(ArrayList배열이름)의
			  getContentsNum(값을 쓰고자함으로 게터메소드 호출)과 같으면서, 
			   스캐너로 입력한 password의 값이 boardList의 getPassword와 같으면 실행한다!)*/
				System.out.print("수정내용 입력 : ");
				String contents = scan.next();
				
				boardList.get(i).setContents(contents);
				/*세터메소드를 이용해 contents의 값이 다시 contents필드에 담겨 
				  boardList라는 ArrayList배열에 해당하는 원래 contents값이 방금 입력한 contents값으로 바뀜*/
				
				/*if문이 for반복문 안에 있어, 서로 맞는 값을 찾을 때 까지 i값이 반복하며 증가하기 때문에
				    이 문장에 있는 i도 if조건문에 있는 같이 반복하며 증가한 값 i와 같은 변수라서 내가 입력한 글번호와 비밀번호 값을 가진 인덱스값을 
				    딱 맞게 찾아 수정할 수 있는 것임
				  */
				System.out.println("내용"+contents);
				System.out.println("수정완료");
			} 
		}
		return boardList;
		//위에서 설정한 boardListd의 값을 return시켜 Main클래스에서 호출한 case 3으로 넘겨줌 
	}
//case 3에서 호출한 List<BoardDTO>리턴타입의 boardModify메소드
	
	
	
	public List<BoardDTO> boardDelete(List<BoardDTO> boardList) {
		System.out.print("삭제 글번호 : ");
		int contentsNum = scan.nextInt();
		scan.nextLine();
		System.out.print("비밀번호 : ");
		String password = scan.next();
		
		for(int i=0; i<boardList.size(); i++) {
			if(contentsNum==boardList.get(i).getContentsNum() && password.equals(boardList.get(i).getPassword())) {
			/*if문의 조건은 boardModify와 같음*/
				boardList.remove(i);
				/*remove메소드를 이용하여 원하는 인덱스번호 값을 삭제할 수 있음*/
				System.out.println("삭제완료");
			} 
		}
		return boardList;
	}
//case 4에서 호출한 List<BoardDTO>리턴타입의 boardDelete메소드
	









}
