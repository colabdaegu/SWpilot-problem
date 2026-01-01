package RuleOfBodome02;

class Book {
    public String isbn;
    public String title;
    public String author;
    public boolean isBorrowed;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    public void printInfo() {
        System.out.println(" · "+ title + ", " + (isBorrowed ? "대출 불가" : "대출 가능"));
    }
}
