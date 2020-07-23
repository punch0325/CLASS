package test200722_01;

import java.util.*;
import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		List<MemberDTO> memList = new ArrayList<MemberDTO>();
		List<BookDTO> bookList = new ArrayList<BookDTO>();
//		MemberDTO member = null;
//		BookDTO book = null;
		BookService bookSer = new BookService();
		
		boolean end = true;
		
		while (end) {
			
			System.out.println("-------------------------------------------------------------");
			System.out.println("1.회원 접수 | 2.회원 목록 | 3.도서 등록 | 4.도서 목록 | 5.도서 대출 | 6.종료");
			System.out.println("-------------------------------------------------------------");
			System.out.print("선택 > ");
			int menuNum = scan.nextInt();
			
			switch(menuNum) {
			case 1 :
				bookSer.memJoin(memList);
				break;
			case 2 :
				bookSer.memView(memList);
				break;
			case 3 :
				bookSer.bookJoin(bookList);
				break;
			case 4 :
				bookSer.bookView(bookList);
				break;
			case 5 :
				bookList = bookSer.bookBorrow(memList, bookList);
				break;
			case 6 :
				end = false;
				System.out.println("프로그램을 종료했습니다.");
				break;
			default :
				System.out.println("메뉴 선택을 다시 해주세요.");
				break;	
			}
		}
		
		scan.close();

	}

}
