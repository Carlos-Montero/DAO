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
        u.update();
        u.select(3);
        u.delete(3);
        u.findAll();

        Office office =new Office(1,"MWV", "theAddress");
        office.insert();
        office.update();
        office.select(1);
        office.delete(1);
        office.findAll();

    }
}
