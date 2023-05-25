package java_book_example.FileIO.Thread;

public class TicketHouse implements Runnable {
    int fiveAmount = 2, twentyAmount = 0;

    public void run() {
        if (Thread.currentThread().getName().equals("�ŷ�"))
            saleTicket(20);
        else if (Thread.currentThread().getName().equals("����"))
            saleTicket(5);
    }

    private synchronized void saleTicket(int money) {
        if (money == 5) {
            fiveAmount = fiveAmount + 1;
            System.out.println("��" + Thread.currentThread().getName() + "�볡ȯ," + Thread.currentThread().getName() + "��Ǯ����");
        } else if (money == 20) {
            while (fiveAmount < 3) {
                try {
                    System.out.println("\n" + Thread.currentThread().getName() + "���ߵ�...");
                    wait();
                    System.out.println("\n" + Thread.currentThread().getName() + "������Ʊ");
                } catch (InterruptedException e) {
                }
            }
            fiveAmount -= 3;
            twentyAmount++;
            System.out.println("��" + Thread.currentThread().getName() + "�볡ȯ," + Thread.currentThread().getName() + "��20���һ�15Ԫ");
        }
        notify();
    }
}
