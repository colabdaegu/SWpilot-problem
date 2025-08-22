package RuleOfBodome02;

abstract class User {
    protected String userId;
    protected String name;

    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public String getRole() {
        return this instanceof Manager ? "관리자" : "이용자";
    }

    public void borrowBook(Book book) {
        if (!book.isBorrowed) {
            book.isBorrowed = true;
            System.out.println(getRole() + " '" + name + "'가 '" + book.getTitle() + "' 대출합니다.");
        } else {
            System.out.println("'" + book.getTitle() + "'은 대출 중입니다.");
        }
    }

    public void returnBook(Book book) {
        if (book.isBorrowed) {
            book.isBorrowed = false;
            System.out.println(getRole() + " '" + name + "'가 '" + book.getTitle() + "' 반납합니다.");
        } else {
            System.out.println("반납할 책이 대출 목록에 없습니다.");
        }
    }

    public String getName() {
        return name;
    }
}