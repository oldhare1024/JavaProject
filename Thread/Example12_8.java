package Thread;

public class Example12_8 {
    public static void main(String[] args) {
        TicketHouse officer = new TicketHouse();
        Thread 张飞, 李逵;
        张飞 = new Thread(officer);
        张飞.setName("张飞");
        李逵 = new Thread(officer);
        李逵.setName("李逵");
        张飞.start();
        李逵.start();
    }
}
