package skypro.lesson9;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Author tolstoy = new Author("Lev", "Tolstoy");
        Author eckel = new Author("Bruce","Eckel");

        Book warAndPeace = new Book(tolstoy, "Война и мир", 1869);
        Book thinkingInJava = new Book(eckel, "Think in Java", 2017);

        System.out.println(warAndPeace);
        System.out.println(thinkingInJava);

        System.out.println("Меняем год выпуска книги");
        thinkingInJava.setPublisherYear(2020);
        System.out.println(thinkingInJava);
    }

}



