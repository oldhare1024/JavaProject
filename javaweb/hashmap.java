package javaweb;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashmap {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap();
        //���Ԫ��
        map.put("a", "b");

        //��ȡԪ��
        String value = map.get("a");

        //ɾ��Ԫ��
        map.remove("a");

        //��ռ���
        map.clear();

        //map�ı���:������
        Set<Map.Entry<String, String>> entries = map.entrySet();

        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();

            String key = entry.getKey();

            String value1 = entry.getValue();
        }

        //forEach
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value1 = entry.getValue();
        }

    }
}

