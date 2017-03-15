package eetac.upc;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        User u = new User(3,"juan","10/05/1995");
        u.insert();

        Office office =new Office("MWV", "theAddress");
        office.insert();
    }
}
