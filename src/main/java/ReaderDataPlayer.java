import java.io.InputStream;

/*
* Ввод данных игрока из разных источников
 */
 public class ReaderDataPlayer extends Reader<DataPlayer>{

    public ReaderDataPlayer(InputStream stream) {
        super(stream);
    }

    @Override
    public DataPlayer read() {
        //System.out.println("Enter name: ");
        String namePlayer = scanner.next();
        //System.out.println("Enter age: ");
        int age = scanner.nextInt();
        //System.out.println("Enter city: ");
        String city = scanner.next();
        //System.out.println("Enter country: ");
        String country = scanner.next();
        //System.out.println("Enter phone: ");
        String telephone = scanner.next();
        //System.out.println("Enter Email: ");
        String email = scanner.next();

        return new DataPlayer(namePlayer, age, city, country, telephone, email);
    }
}
