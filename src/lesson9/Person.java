package lesson9;

import java.time.LocalDate;

public class Person {
    private final String name;
    private final String sex;
    private final String religion;
    private final String languageSpoken;
    private boolean job;
    private final String nationality;
    private String egn;
    private String dateOfBirth;
    private int age;
    private String countryOfResidence;

    public Person(String name, String sex, String religion, String languageSpoken, boolean job, String nationality, String egn, String countryOfResidence) {
        this.name = name;
        this.sex = sex;
        this.religion = religion;
        this.languageSpoken = languageSpoken;
        this.job = job;
        this.nationality = nationality;
        setEgn(egn);
        setDateOfBirth(egn);
        setAge(egn);
        this.countryOfResidence = countryOfResidence;
    }

    private void setEgn(String egn) {
        if (egn.length() == 10 && setOnlyDigits(egn)) {
            this.egn = egn;
        } else {
            throw new RuntimeException("The provided EGN is not valid!");
        }
    }

    private boolean setOnlyDigits(String str) {
        try {
            Long.parseLong(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public void setDateOfBirth(String egn) {
        String date = egn.substring(4, 6);
        String mount = egn.substring(2, 4);
        this.dateOfBirth = mount + "-" + date;
    }

    public void setAge(String egn) {
        String birthYear = "19" + egn.substring(0, 2);
        int currentYear = LocalDate.now().getYear();
        this.age = currentYear - Integer.parseInt(birthYear);
    }

    public void sayHello() {
        switch (languageSpoken) {
            case "Bulgarian":
                System.out.println("Здравей");
                break;
            case "Italian":
                System.out.println("Ciao");
                break;
            default:
                System.out.println("Hello");
        }
    }

    public void celebrateEaster() {
        switch (religion) {
            case "Orthodox":
                System.out.println("The Orthodox celebrate Easter");
                break;
            case "Catholic":
                System.out.println("The Catholic celebrate Easter ");
                break;
            default:
                System.out.println("Islam doesn't celebrate Easter or the submitted religion is wrong");
        }
    }

    public void isAdult() {
        switch (countryOfResidence) {
            case "USA":
                if (age >= 21) {
                    System.out.println("You are adult.");
                }
                break;
            default:
                if (age >= 18) {
                    System.out.println("You are adult.");
                }
        }
    }
    public void canTakeLoan(){
        if (job == true) {
            System.out.println("You can take loan.");
        } else {
            System.out.println("You cannot take loan.");
        }
    }
}
