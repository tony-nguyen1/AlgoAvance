package AlgoAvance;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Polynome poly = new Polynome(2,3, new Polynome(5,2,new Polynome(1,5,new Polynome(0,4,new Polynome()))));

        System.out.println(poly.toString());
        System.out.println(poly.eval(2));

        System.out.println(poly.degre());

        System.out.println(poly.simplifie().toString());

        System.out.println(poly.deriver());
    }
}
