import java.util.Scanner;

public class BookApp
{
    public static void main (String [] args)
    {
//        Scanner scan =new Scanner(System.in);
//       String userInput= scan.next();

        Book b1 = new Book();
        b1.setAuthor("jk rowling");
        b1.setTitle("harry potter");
        b1.setDescription("popular book");
        b1.setPrice(20.5);

        b1.getDisplayText();

    }
}