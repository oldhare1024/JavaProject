package test5;

import java.util.regex.*;
public class ReplaceErrorWord {
    public static void main(String[] args) {
        String str = "�������룬��Ҫ����ʧ�����½www.yy.cn���½www.tt.cc";

//���Ƚ�"��½"�滻Ϊ"��¼"
        String regex = "��½";
        Pattern pattern = Pattern.compile(regex);   //ʹ��regex��ʼ��ģʽ����pattern
        Matcher matcher = pattern.matcher(str);   //�õ�����str��ƥ�����matcher
        while(matcher.find()) {
            String s = matcher.group();
            System.out.print(matcher.start()+"λ�ó���:");
            System.out.println(s);
        }
        System.out.println("��\"��½\"�滻Ϊ\"��¼\"���ַ���:");
        String result = matcher.replaceAll("��¼");
        System.out.println(result);

//���Ž�"����ʧ��"�滻Ϊ"����ʧ��"
        pattern= Pattern.compile("����ʧ��");
        matcher =pattern.matcher(result);
        System.out.println("��\"����ʧ��\"�滻Ϊ\"����ʧ��\"���ַ���:");
        result = matcher.replaceAll("����ʧ��");
        System.out.println(result);
    }
}
