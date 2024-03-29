public class Book
{
    private String title, author, description;
    private double price;
    private boolean isInStock;

    // constructor runs when the keyword 'new' is encountered
    // no argument constructor
    public Book()
    {
        System.out.println("The constructor has run");
    }
    //overloaded constructor allows us to pass parameters
    public Book(String title, String author, String description, double price, boolean isInStock)
    {
        this.title=title;
        this.author=author;
        this.description=description;
        this.price=price;
        this.isInStock=isInStock;
    }
        //method
        public void setTitle(String title)
        {
            this.title=title;
        }

        public String getTitle()
        {
            return title;
        }

        public void setAuthor(String author)
        {
            this.author=author;
        }

        public String getAuthor()
        {
            return author;
        }

        public void setDescription(String description)
        {
            this.description=description;
        }

        public double getPrice()
        {
            return price;
        }

        public void setPrice(double price)
        {
            this.price=price;
        }

        public boolean getisInStock ()
        {
            return isInStock;
        }

        public void setisInStock (boolean isInStock)
        {
            this.isInStock=isInStock;
        }

        public void getDisplayText()
        {
            System.out.println("Author: " + this.author + " " + "Title : " + this.title + " " + " Description : "
                    + this.description + " " + "Price : " + this.price + " " + "IsinStock: " + this.isInStock);
        }

}

