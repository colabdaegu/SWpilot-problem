### SOLID 원칙
김현수


# SOLID 원칙의 등장과 필요성
객체지향 프로그래밍에서 유지보수성과 확장성을 확보하려면, 각 클래스와 모듈이 명확한 역할을 가지면서 변화에 유연하게 대응할 수 있어야 하는데, 이 대안으로 나온 게 SOLID의 다섯가지 원칙이다.

필요 이유 : 재사용성, 유지보수성, 확장성, 테스트 용이성, 유연성 등을 높이기 위해



# SOLID 다섯가지 원칙 소개
SRP(단일 책임 원칙) - 객체는 단 하나의 책임만 가져야 한다는 원칙.
OCP(개방-폐쇄 원칙) - 기존의 코드를 변경하지 않고 기능을 추가할 수 있도록 설계해야 한다는 원칙. 하나의 인터페이스로 묶어 캡슐화하는 방법.
LSP(리스코프 치환 원칙) - 자식 클래스는 최소한 자신의 부모 클래스에서 가능한 행위는 수행할 수 있어야 한다는 설계 원칙.
ISP(인터페이스 분리 원칙) - 자신이 사용하지 않는 인터페이스와 의존 관계를 맺거나 영향을 받지 않아야 한다는 원칙. 인터페이스가 갖는 하나의 책임.
DIP(의존 역전 원칙) - 의존 관계가 성립될 때, 추상성이 낮은 클래스보다 추상성이 높은 클래스와 의존 관계를 맺어야 한다는 원칙.


# 도서관 시스템에서 SOLID 원칙에 어긋나는 부분
① SRP 위반 - User 클래스
abstract class User {
	abstract void addBook(Book book, Library library);
	abstract void removeBook(Book book, Library library); 
}

- User 클래스가 대출 기능뿐만 아니라 도서 추가/삭제 기능까지 책임지고 있으므로, 단일 책임 원칙에 위배된다.


② LSP 위반 - Member 클래스
class Member extends User {
    public Member(String userId, String name) {
        super(userId, name);
    }
		
		public void addBook(Book book, Library library) {
				System.out.println("Member can't add book");
		}
		public void removeBook(Book book, Library library) {
				System.out.println("Member can't remove book");
		}
}

- Member는 User를 상속받았지만, addBook과 removeBook을 사용할 수 없으므로, 리스코프 치환 원칙에 위배된다.


③ ISP 위반 - User/Member 클래스
abstract class User {

    abstract void addBook(Book book, Library library);
    abstract void removeBook(Book book, Library library);
}

class Member extends User {
    public Member(String userId, String name) {
        super(userId, name);
    }
		
		public void addBook(Book book, Library library) {
				System.out.println("Member can't add book");
		}
		public void removeBook(Book book, Library library) {
				System.out.println("Member can't remove book");
		}
}

- User 추상 클래스에서 addBook, removeBook 메서드를 강제로 구현하도록 하고 있지만, Member는 해당 기능과 전혀 관련 없음에도 구현하도록 되었기 때문에, 인터페이스 분리 원칙에 위배된다.
