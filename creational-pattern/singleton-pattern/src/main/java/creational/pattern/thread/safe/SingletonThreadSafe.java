package creational.pattern.thread.safe;

public final class SingletonThreadSafe {
    // The field must be declared volatile so that double check lock would work
    private static volatile SingletonThreadSafe instance;

    public String value;

    private SingletonThreadSafe(String value) {
        this.value = value;
    }

    // lazy initialization
    public static SingletonThreadSafe getInstance(String value) {
        SingletonThreadSafe result = instance;
        if (result != null) {
            return result;
        }
        synchronized(SingletonThreadSafe.class) {
            if (instance == null) {
                instance = new SingletonThreadSafe(value);
            }
            return instance;
        }
    }
}
