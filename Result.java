import Library_management.Book;
import Library_management.Member;

public class Result {
    public static void main(String[] args) {

        // Create Book object
        Book b1 = new Book("Java Programming", "James Gosling", "12345");

        // Create Member object
        Member m1 = new Member("Balaji", 101);

        System.out.println("----- Book Details -----");
        b1.displayBook();

        System.out.println("\n----- Member Details -----");
        m1.displayMember();
    }
}
