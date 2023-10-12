package javaweb;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashmap {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap();
        //添加元素
        map.put("a", "b");

        //获取元素
        String value = map.get("a");

        //删除元素
        map.remove("a");

        //清空集合
        map.clear();

        //map的遍历:迭代器
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

