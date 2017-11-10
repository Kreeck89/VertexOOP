package lesson2OOP.HomeWork.customer;

public class User {

    private String name;
    private String surname;
    private String nickName;
    private String city;
    private String email;
    private String order;
    private String password;
    private int age;
    private long phoneNumber;

    public User() {
    }

    public User(String nickName, String email, String password, int phoneNumber) {
        this.nickName = nickName;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public User(String name, String surname, String nickName, String city, String email,
                String password, int age, long phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.nickName = nickName;
        this.city = city;
        this.email = email;
        this.password = password;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public User(String name, String surname, String nickName, String city, String email, String order,
                String password, int age, int phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.nickName = nickName;
        this.city = city;
        this.email = email;
        this.order = order;
        this.password = password;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\n"
                + "Surname: " + getSurname() + "\n"
                + "Nick: " + getNickName() + "\n"
                + "City: " + getCity() + "\n"
                + "E-mail: " + getEmail() + "\n"
                + "His Order: " + getOrder() + "\n"
                + "age: " + getAge() + "\n"
                + "Mobile Phone: " + getPhoneNumber();
    }
}
