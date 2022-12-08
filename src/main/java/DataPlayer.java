
/*
* Хранение данных игрока
 */

public class DataPlayer{
    private String namePlayer;
    private int age;
    private String city;
    private String country;
    private String telephone;
    private String email;


    public DataPlayer(String namePlayer, int age, String city, String country, String telephone, String email) {
        this.namePlayer = namePlayer;
        this.age = age;
        this.city = city;
        this.country = country;
        this.telephone = telephone;
        this.email = email;
    }



    public String getNamePlayer() {
        return namePlayer;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "DataPlayer{" +
                "namePlayer='" + namePlayer + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
