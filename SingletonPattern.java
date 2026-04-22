package Interview; // This must be the first line!

public class SingletonPattern {
    private static volatile SingletonPattern instance;

    private SingletonPattern() {}

    public static SingletonPattern getInstance() {
        if (instance == null) {
            synchronized (SingletonPattern.class) {
                if (instance == null) {
                    instance = new SingletonPattern();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        SingletonPattern s1 = SingletonPattern.getInstance();
        SingletonPattern s2 = SingletonPattern.getInstance();
        System.out.println("Are they the same? " + (s1 == s2));
    }
}