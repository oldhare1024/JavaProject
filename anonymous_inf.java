interface SpeakHello{
    void speak();
}
class HelloMachine{
    public void turnOn(SpeakHello hello){
        hello.speak();
    }
}
public class anonymous_inf {
    public static void main(String []args){
        HelloMachine machine=new HelloMachine();
        machine.turnOn(new SpeakHello() {
                @Override
                public void speak() {
                    System.out.println("hello,u're welcome!");
                }
            }
        );
        machine.turnOn(new SpeakHello() {
                @Override
                public void speak() {
                    System.out.println("ÄãºÃ£¬²»ÓÃÐ»£¡");
                }
            }
        );
    }
}
