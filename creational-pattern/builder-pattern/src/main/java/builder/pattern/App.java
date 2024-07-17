package builder.pattern;

import builder.pattern.impl.ConcreteHouseBuilder;
import builder.pattern.impl.Director;
import builder.pattern.impl.Home;
import builder.pattern.impl.HomeBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("Figure out which type of house we are building");
        HomeBuilder homeBuilder = new ConcreteHouseBuilder();
        Director directorBuilder = new Director(homeBuilder);
        directorBuilder.constructLuxuryHouse();
        Home luxuryHouse = directorBuilder.getHouse();
        System.out.println("Luxury House: " + luxuryHouse);

        // Construct a simple house
        directorBuilder.constructSimpleHouse();
        Home simpleHouse = directorBuilder.getHouse();
        System.out.println("Simple House: " + simpleHouse);
    }
}
