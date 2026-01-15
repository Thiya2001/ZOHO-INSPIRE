public class Book {
    private String title;
    private String author;
    private String publisher;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    public static void main(String[] args) {
        Book bk = new Book();

        bk.setTitle("Java Programming");
        bk.setAuthor("James Gosling");
        bk.setPublisher("Oracle");

        System.out.println("Title : " + bk.getTitle());
        System.out.println("Author : " + bk.getAuthor());
        System.out.println("Publisher : " + bk.getPublisher());
    }
}
