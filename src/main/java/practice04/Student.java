package practice04;

public class Student extends  Person{
    private String klass;

    @Override
    public String introduce() {
        return super.basicIntroduce()+" I am a Student. I am at Class 2.";
    }
}
