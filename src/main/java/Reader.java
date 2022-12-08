
import java.io.InputStream;
import java.util.Scanner;

 abstract public class Reader<T> {
    protected final Scanner scanner;
    public  Reader(InputStream stream){
        scanner = new Scanner(stream);
    }
    abstract public T read();
}
