package test200722_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookService {
	
	Scanner scan = new Scanner(System.in);
	List<MemberDTO> memList = new ArrayList<MemberDTO>();
	List<BookDTO> bookList = new ArrayList<BookDTO>();
	MemberDTO member = null;
	BookDTO book = null;

	int memberNum = 0;
	int bookNum = 0;
	
////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public List<MemberDTO> memJoin (List<MemberDTO> memList) {
		System.out.print("성명 : ");
		String memberName = scan.nextLine();
		System.out.print("전화번호 : ");
		String memberPhone = scan.nextLine();
		
		int memberNum = memList.size()+1;
				
		member = new MemberDTO();
		member.setMemberName(memberName);
		member.setMemberPhone(memberPhone);
		member.setMemberNum(memberNum);
		
		memList.add(member);
		
		return memList;
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void memView(List<MemberDTO> memList) {
		for (int i = 0; i<memList.size(); i++) {
			System.out.println(memList.get(i));
		}
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////

	public List<BookDTO> bookJoin(List<BookDTO> bookList){
		System.out.print("제목 : ");
		String bookSubject = scan.nextLine();
		System.out.print("지은이 : ");
		String author = scan.nextLine();
		int bookNum = bookList.size()+1;
		boolean borrow = true;
		
		book = new BookDTO();
		book.setBookSubject(bookSubject);
		book.setAuthor(author);
		book.setBookNum(bookNum);
		book.setBorrow(borrow);
		
		bookList.add(book);
		
		return bookList;
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void bookView(List<BookDTO> bookList) {
		for (int i = 0; i<bookList.size(); i++) {
			if (bookNum == bookList.get(i).getBookNum()) {
				bookList.get(i).setMemNum(memberNum); 
			}
			System.out.println(bookList.get(i));				
		}
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public List<BookDTO> bookBorrow (List<MemberDTO> memList, List<BookDTO> bookList) {
		System.out.print("회원 번호를 입력하세요 : ");
		memberNum = scan.nextInt();
		System.out.print("대출 도서 번호를 입력하세요 : ");
		bookNum = scan.nextInt();
		
		for (int i = 0 ; i < memList.size(); i++) {
			if (memberNum == memList.get(i).getMemberNum()) {
				for (int j = 0; j <bookList.size(); j++ ) {
					if(bookNum == bookList.get(j).getBookNum()) {
						bookList.get(j).setBorrow(false);
					}
				}
			}
		}			
		System.out.println("도서 대출이 완료되었습니다♥");
		return bookList;
	}
	
































}
