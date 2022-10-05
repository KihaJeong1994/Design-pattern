public final class Singleton {
    private static volatile Singleton instance; //volatile : being stored in main memory(not from the CPU cache)

    public String value;

    private Singleton(String value){
        this.value = value;
    }

    public static Singleton getInstance(String value){
        // DCL : Double-checked locking
        // https://refactoring.guru/java-dcl-issue
        Singleton result = instance; // important caveat when implementing DCL in java
        if(result!=null){
            return result;
        }
        synchronized(Singleton.class){ // synchronized : only one thread can access here https://coding-start.tistory.com/68 synchronized(monitor object)
            if(instance==null){
                instance = new Singleton(value);
            }
            return instance;
        }

    }
}
