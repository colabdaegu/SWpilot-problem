package RuleOfBodome02;

class Manager extends User implements BookManager {
    public Manager(String userId, String name) {
        super(userId, name);
    }

    public void addBook(Book book, Library library) {
        library.addBook(book);
        System.out.println("관리자 '" + name + "'가 책을 추가합니다: '" + book.getTitle() + "', '" + book.getAuthor() + "'");
    }

    public void removeBook(Book book, Library library) {
        if (book.isBorrowed) {
            System.out.println("대출 중인 책은 삭제할 수 없습니다.");
        } else {
            library.removeBook(book);
            System.out.println("관리자 '" + name + "'가 책을 삭제합니다: '" + book.getTitle() + "'");
        }
    }
}