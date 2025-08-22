package RuleOfBodome02;

public class RuleOfBodome02 {
    public static void main(String[] args) {
        Library library = new Library();

        Manager seiko = new Manager("M001", "세이코");
        library.addUser(seiko);
        Member mary = new Member("U001", "메리");
        library.addUser(mary);
        Member manok = new Member("U002", "만옥");
        library.addUser(manok);
        System.out.println();

        Book b1 = new Book("001", "자바의 구름", "제임스밥");
        seiko.addBook(b1, library);
        Book b2 = new Book("002", "파이썬 마스터", "한송희");
        seiko.addBook(b2, library);
        Book b3 = new Book("003", "에너지 플로우", "키네틱스");
        seiko.addBook(b3, library);
        Book b4 = new Book("004", "화성에서의 기억", "한송희");
        seiko.addBook(b4, library);
        Book b5 = new Book("005", "야채의 비밀", "송은정");
        seiko.addBook(b5, library);
        System.out.println();

        mary.borrowBook(b1);
        System.out.println();

        Book b6 = new Book("006", "자료구조의 언덕", "황수");
        seiko.addBook(b6, library);
        Book b7 = new Book("007", "그곳에 가면", "한송희");
        seiko.addBook(b7, library);
        System.out.println();

        manok.borrowBook(b1);
        System.out.println();

        mary.returnBook(b1);
        System.out.println();

        seiko.borrowBook(b4);
        System.out.println();

        library.searchBooksByAuthor("한송희");
    }
}
