package Thread;

public class Example12_8 {
    public static void main(String[] args) {
        TicketHouse officer = new TicketHouse();
        Thread �ŷ�, ����;
        �ŷ� = new Thread(officer);
        �ŷ�.setName("�ŷ�");
        ���� = new Thread(officer);
        ����.setName("����");
        �ŷ�.start();
        ����.start();
    }
}
