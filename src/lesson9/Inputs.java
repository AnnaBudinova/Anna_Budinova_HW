package lesson9;

public class Inputs {
    public static void main(String[] args) {
        Person bulgarian = new Person("Anna Budinova", "female", "Orthodox", "Bulgarian", false, "Bulgarian", "7808085371", "Bulgaria");
        Person usa = new Person("Jonh Smith", "male", "Catholic", "English", true, "American", "1608085371", "USA");
        bulgarian.sayHello();
        bulgarian.celebrateEaster();
        bulgarian.isAdult();
        usa.sayHello();
        usa.celebrateEaster();
        usa.isAdult();
        bulgarian.canTakeLoan();
    }
}
