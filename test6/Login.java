package test6;

/*
�����û���¼
*/

public class Login {

    User user;

    void setUser(User user) {
        this.user = user;
    }

    /*
     * JudgeUser()���� �ж�User��ID�������Ƿ���ȷ�������ȷ����ʾ��¼�ɹ���������󣬵���һ�����ڣ���ʾ�˺Ż��������
     */
    public boolean login(User user) {
        if (user.getID().equals("001") && user.getPassword().equals("1234")) {
            user.setName("Tom");
            return true;
        } else
            return false;
    }

    int JudgeUser() {
        if (login(this.user)) {
            System.out.println("��¼�ɹ�");
            return 1;
        } else {
            return 0;
        }
    }
}
