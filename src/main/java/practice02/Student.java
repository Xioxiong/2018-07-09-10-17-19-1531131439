package practice02;

public class Student extends Person{
    private String klass;

    @Override
    public String introduce() {
        return "I am a Student. I am at Class 2.";
    }
}
