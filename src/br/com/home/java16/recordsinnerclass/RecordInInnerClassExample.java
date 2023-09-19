package br.com.home.java16.recordsinnerclass;

record Book(String title, String author, String isbn) {
}

class OuterClass {
     class InnerClass {
        Book book = new Book("Title", "author", "isbn");
    }
}

public class RecordInInnerClassExample {

    public static void main(String[] args) {
        final OuterClass.InnerClass innerClass = new OuterClass().new InnerClass();
        System.out.print(innerClass.book);

    }
}
