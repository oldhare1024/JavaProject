package javaweb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arraylist {

    public static void main(String[] args) {
        List<String> list = new ArrayList();
        //���Ԫ��
        list.add("����");
        list.add("20");

        //��ȡԪ��
        String s = list.get(0);

        //ɾ��Ԫ��
        list.remove(0);

        //��ռ���
        list.clear();

        //��ȡ����Ԫ�ظ���
        list.size();

        //��ͨforѭ��

        //��ǿforѭ��
        for (String s1 : list) {
            System.out.println(s1);
        }

        //���еļ��϶�����ʹ�õ��������б���
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
