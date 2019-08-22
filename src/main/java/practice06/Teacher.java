package practice06;

public class Teacher extends Person{
    private String klass;

    @Override
    public String introduce() {
        if(this.klass == null){
            return super.introduce()+" I am a Teacher. I teach No Class.";
        }
        return super.introduce()+" I am a Teacher. I teach Class 2.";
    }
}
