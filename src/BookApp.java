import java.util.Scanner;

public class BookApp
{
    public static void main (String [] args)
    {
        //default constructor
        Book b1 = new Book();
        //Type: Book
        //Object name: b1
        b1.setAuthor("jk rowling");
        b1.setTitle("harry potter");
        b1.setDescription("popular book");
        b1.setPrice(20.5);
        b1.setisInStock(true);

        b1.getDisplayText();


        // use overloaded constructor
        Book mybook1= new Book("java programming", "A Rogers", "fun with java", 20.5, true);
        mybook1.getDisplayText();

        Book mybook2= new Book("A Song of Ice and Fire", "George R. R. Martin", " epic fantasy series of kings & Lords", 20.5, true);
        mybook2.getDisplayText();

        Book mybook3= new Book("The Hobbit and The Lord of the Rings", "J.R.R. Tolkien", "fantasy movie of kings & Lords", 20.5, true);
        mybook3.getDisplayText();

        Scanner scan =new Scanner(System.in);
        System.out.println ( "How many Books would you like to buy?" );
        System.out.println ( "Enter number of books ?" );
        int userNum= scan.nextInt();
        System.out.println ( "Enter Price of books ?" );
        int unitPrice= scan.nextInt();
        int Total=userNum * unitPrice;
        System.out.println("The total book cost is : " +Total);






    }
}