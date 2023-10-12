package javaweb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arraylist {

    public static void main(String[] args) {
        List<String> list = new ArrayList();
        //添加元素
        list.add("张三");
        list.add("20");

        //获取元素
        String s = list.get(0);

        //删除元素
        list.remove(0);

        //清空集合
        list.clear();

        //获取集合元素个数
        list.size();

        //普通for循环

        //增强for循环
        for (String s1 : list) {
            System.out.println(s1);
        }

        //所有的集合都可以使用迭代器进行遍历
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
