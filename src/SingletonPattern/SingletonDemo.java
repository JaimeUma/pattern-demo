package SingletonPattern;

public class SingletonDemo {

    public static void main(String[] args) {

        System.out.println("Simple test for Singleton Pattern");
        Singleton instanceOne = Singleton.getInstance();
        System.out.println("instance 1: " + System.identityHashCode(instanceOne));
        Singleton instanceTwo = Singleton.getInstance();
        System.out.println("instance 2: " + System.identityHashCode(instanceTwo));
    }

}
