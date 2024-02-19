package Book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMain {
	public static ArrayList<Book> books = new ArrayList<>();
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		//도서 등록,검색,삭제,확인,구입,종료
		 while (true) {
	            System.out.println("---------------------------------------------");
	            System.out.println("1. 도서 등록	2. 도서 삭제	3. 도서 검색");
	            System.out.println("4. 도서 목록 출력	5. 도서 구입	6.종료");
	            System.out.println("---------------------------------------------");
	            System.out.print(">>");
	            int choice = scanner.nextInt();
	            
	            scanner.nextLine();
	            
	            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                	removeBook();
                    break;
                case 3:
                	searchBook();
                    break;
                case 4:
                    listBooks();
                    break;
                case 5:
                	purchaseBook();
                    break;
                case 0:
                    System.out.println("프로그램 종료");
                    return;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
		 }

	}

	 // 도서 추가
	 private static void addBook() {
		 System.out.println("1. 종이책 등록 | 2. 전자책 등록");
	     System.out.print(">>");

	        int choice = scanner.nextInt();
	        scanner.nextLine();

	        switch (choice) {
	            case 1:
	                addPaperBook();
	                break;
	            case 2:
	                addEBook();
	                break;
	            default:
	                System.out.println("잘못된 입력입니다.");
	        }
	    }
	 
	 private static void addPaperBook() {
		 System.out.print("도서 제목: ");
	        String title = scanner.nextLine();
	        System.out.print("저자: ");
	        String author = scanner.nextLine();
	        System.out.print("출판사: ");
	        String publisher = scanner.nextLine();
	        System.out.print("가격: ");
	        int price = scanner.nextInt();
	        System.out.print("페이지 수: ");
	        int size = scanner.nextInt();

	        books.add(new PaperBook(title, author,  publisher,price, size));
	        System.out.println("도서가 등록되었습니다.");
	 }
	 public static void addEBook() {
		
		 System.out.print("도서 제목: ");
	        String title = scanner.nextLine();
	        System.out.print("저자: ");
	        String author = scanner.nextLine();
	        System.out.print("출판사: ");
	        String publisher = scanner.nextLine();
	        System.out.print("가격: ");
	        int price = scanner.nextInt();
	        System.out.print("호환 기기 (쉼표로 구분): ");
	        String[] devices = scanner.nextLine().split(",");

	        books.add(new EBook(title, author, publisher, price, devices));
	        System.out.println("도서가 등록되었습니다.");
	 }
	 //도서 삭제
	 private static void removeBook() {
		
		 System.out.print("삭제할 도서 제목: ");
		 String title = scanner.nextLine();
	        
		 int index = findBookIndex(title);
	        if (index == -1) {
	            System.out.println("해당 도서가 없습니다.");
	            return;
	        }

	        books.remove(index);
	        System.out.println("도서가 삭제되었습니다.");
	 }

	 private static void listBooks() {
	    for (Book book : books) {
	            System.out.println(book);
	        }
	    }
	    
	    private static void searchBook() {
	        System.out.print("검색할 도서 제목: ");
	        String title = scanner.nextLine();

	        int index = findBookIndex(title);
	        if (index == -1) {
	            System.out.println("해당 도서가 없습니다.");
	            return;
	        }

	        System.out.println(books.get(index));
	    }
	    
	    private static void purchaseBook() {
	        System.out.print("구매할 도서 제목: ");
	        String title = scanner.nextLine();

	        int index = findBookIndex(title);
	        
	        Book book = books.get(index);
	        
	        System.out.println(book.getTitle() + "을 구매했습니다.");
	        System.out.println("총 결제 금액은 " + (book.getPrice() * book.getTax()) + "원입니다.");
	    }

	    private static int findBookIndex(String title) {
	        for (int i = 0; i < books.size(); i++) {
	            if (books.get(i).getTitle().equals(title)) {
	                return i;
	            }
	        }
	        return -1;
	    }
	  
}
