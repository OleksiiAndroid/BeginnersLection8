package ua.com.webacademy.beginnerslection8;

public class Student {
    public String FirstName;
    public String LastName;
    public int Age;

    public Student(String firstName, String lastName, int age) {
        this.FirstName = firstName;
        this.LastName = lastName;
        this.Age = age;
    }

    @Override
    public String toString() {
        return String.format("%s %s, %s", FirstName, LastName, String.valueOf(Age));
    }
}
