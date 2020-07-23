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
			System.out.println("1.ȸ�� ���� | 2.ȸ�� ��� | 3.���� ��� | 4.���� ��� | 5.���� ���� | 6.����");
			System.out.println("-------------------------------------------------------------");
			System.out.print("���� > ");
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
				System.out.println("���α׷��� �����߽��ϴ�.");
				break;
			default :
				System.out.println("�޴� ������ �ٽ� ���ּ���.");
				break;	
			}
		}
		
		scan.close();

	}

}
