
public class Book {
    public static void main(String[] args) {

        myBook book1 = new myBook();
        myBook book2 = new myBook();
        myBook book3 = new myBook();

        book1.title = "Bang-e-Dra";
        book1.author = "Allama Iqbal";
        book1.publicationYear = 1924;

        book2.title = "Diwan-e-Ghalib";
        book2.author = "Mirza Ghalib";
        book2.publicationYear = 1861;

        book3.title = "Atomic Habits";
        book3.author = "James Clear";
        book3.publicationYear = 2018;

        book1.displayBookInfo();
        book2.displayBookInfo();
        book3.displayBookInfo();
    }
}

class myBook {

    String title;
    String author;
    int publicationYear;
    public void displayBookInfo() {
        System.out.println("-----***((( Book Details )))***-----");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("-----------------***----------------");
    }
}
