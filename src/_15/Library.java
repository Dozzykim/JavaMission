package _15;

import java.util.ArrayList;
import java.util.List;

public class Library {

    public static void main(String[] args) {
        
        Book book1 = new Book("123123", "이게 자바냐", "감자바", "자바 감자바", 33000);
        Book book2 = new Book("112112", "정보처리기사", "김휴먼", "국가기술자격", 45000);
        Book book3 = new Book("001001", "실무 DB  ", "박디비", "디비디비딥", 60000);
        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);

        System.out.println("=============== ALOHA 스터디 도서관 ===============");
        for (Book book : bookList) {
            System.out.print(book.getIsbn());
            System.out.print("|");
            System.out.print(book.getTitle());
            System.out.print("\t|");
            System.out.print(book.getWriter());
            System.out.print("\t|");
            System.out.print(book.getContent());
            System.out.print("\t|");
            System.out.print(book.getPrice());
            System.out.println();
        }
    }
    
}
