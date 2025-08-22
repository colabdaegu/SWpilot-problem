package RuleOfBodome02;

import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Book> books = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println("새로운 " + (user instanceof Manager ? "관리자" : "이용자") + " '" + user.getName() + "'를 등록합니다.");
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public void searchBooksByAuthor(String author) {
        System.out.println("저자 '" + author + "'의 책 목록:");
        boolean found = false;
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                book.printInfo();
                found = true;
            }
        }
        if (!found) System.out.println("해당 저자의 책이 없습니다.");
    }
}