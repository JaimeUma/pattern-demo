package SingletonPattern;

public class Singleton {

    // static reference to the one and only instance
    private static Singleton theInstance = null;

    // add some instance attributes

    // private constructor
    private Singleton() {
        // do your stuff
    }

    public static synchronized Singleton getInstance() {
        if (theInstance == null) {
            theInstance = new Singleton();
                }
        return theInstance;
    }

    // add some instance methods

}
