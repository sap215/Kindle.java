import java.util.Scanner;
//=============================================================================
public class UseKindle {
    //-----------------------------------------------------------------------------
    private static final Scanner keyboard = new Scanner(System.in);
    //-----------------------------------------------------------------------------
    public static void main(String[] args) {

        Kindle aBook;
        int numberOfPages;

//----Get person information
        System.out.print("How many pages in the book : ");
        numberOfPages = keyboard.nextInt();

//----Create object
        aBook = new Kindle(numberOfPages);
        System.out.print("Initially                  : ");
        System.out.println(aBook);

//----Do some reading
        aBook.turnPages();
        aBook.turnPages();
        aBook.turnPages();
        aBook.turnPages();
        System.out.print("A bit later                : ");
        System.out.println(aBook);

//----Skip ahead
        aBook.turnPages(27);
        System.out.print("After skipping 27 pages    : ");
        System.out.println(aBook);
        System.out.print("You were on                : ");
        System.out.println(aBook);

//----Try skip past the end of the book
        aBook.turnPages(8);
        System.out.print("You are now on             : ");
        System.out.println(aBook);
    }
//-----------------------------------------------------------------------------
}
//=============================================================================
