package swing;

public class Example9_7 {
    public static void main(String[] args) {
        WindowActionEvent1 win = new WindowActionEvent1();
        PoliceListen police = new PoliceListen();//����������
        win.setMyCommandListener(police);//������ϼ�����
        win.setBounds(100, 100, 640, 480);
        win.setTitle("����ActionEvent�¼�(�ַ���ͳ�Ƴ���)");
    }
}
