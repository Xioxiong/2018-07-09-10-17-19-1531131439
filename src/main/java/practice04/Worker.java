package practice04;

public class Worker extends Person{
    public String introduce(){
        return super.basicIntroduce()+" I am a Worker. I have a job.";
    }
}
