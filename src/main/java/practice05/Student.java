package practice05;

public class Student extends  Person{
    private String klass;

    @Override
    public String introduce() {
        return super.introduce()+" I am a Student. I am at Class 2.";
    }
}
