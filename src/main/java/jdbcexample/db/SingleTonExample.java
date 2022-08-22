package jdbcexample.db;

public class SingleTonExample {


    private static SingleTonExample instance=new SingleTonExample();

    private SingleTonExample (){

    }
    public static SingleTonExample getInstance() {
        return instance;
    }
}
