package swing;

import java.awt.*;

public class GridBagLayoutDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("������GridBagLayout����");
        GridBagLayout gb1 = new GridBagLayout();//����һ��GridBagLayout����
        frame.setLayout(gb1);//�ѵ�ǰ���Frame����Ĳ��ֹ���������ΪGridBagLayout
        GridBagConstraints gbc = new GridBagConstraints();//����һ��GridBagConstraints����
        Button[] bt = new Button[10];//����һ������Ϊ10��Button����
        for (int i = 0; i < bt.length; i++) {
            bt[i] = new Button("��ť" + (i + 1));
        }//���������ʼ��ÿһ��Button
        gbc.fill = GridBagConstraints.BOTH;
        //�������е�GridBagConstraints�����fill����ΪGridBagConstraints.BOTH�����пհ�����ʱ������Զ�����մ���հ�����
        gbc.weightx = 1;//����GridBagConstraints�����weightx����Ϊ1����ʾ������չ����Ϊ1
        //��frame����������е�ǰ����Button
        addComponent(frame, bt[0], gb1, gbc);
        addComponent(frame, bt[1], gb1, gbc);
        addComponent(frame, bt[2], gb1, gbc);
        //��GridBagConstraints��gridwideth����ΪGridBagConstraints.REMAINDER,������ǰ����Ǻ������һ�����
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        addComponent(frame, bt[3], gb1, gbc);//��Button����ĵ��ĸ���ť��ӵ�frame��
        gbc.weighty = 1;//����GridBagConstraints�����weighty����Ϊ1����ʾ������չ����Ϊ1
        addComponent(frame, bt[4], gb1, gbc);//��Button����ĵ������ť��ӵ�frame��
        gbc.gridheight = 2;
        gbc.gridwidth = 2;
        //��Button�����gridheight��gridwidth����Ϊ2����ʾ����ͺ����ռ����������
        addComponent(frame, bt[5], gb1, gbc);//��Button����ĵ�������ť��ӵ�frame��
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        //��Button�����gridheight��gridwidth����Ϊ1����ʾ����ͺ����ռ��һ������
        addComponent(frame, bt[6], gb1, gbc);//��Button����ĵ��߸���ť��ӵ�frame��
        //��GridBagConstraints��gridwideth����ΪGridBagConstraints.REMAINDER,������ǰ����Ǻ������һ�����
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        addComponent(frame, bt[7], gb1, gbc);//��Button����ĵڰ˸���ť��ӵ�frame��
        gbc.gridwidth = 1;
        //��Button�����gridwidth����Ϊ1����ʾ�����ռ��һ������
        addComponent(frame, bt[8], gb1, gbc);//��Button����ĵھŸ���ť��ӵ�frame��
        addComponent(frame, bt[9], gb1, gbc);//��Button����ĵ�ʮ����ť��ӵ�frame��
        frame.pack();
        frame.setVisible(true);
    }

    public static void addComponent(Container container, Component c, GridBagLayout gridBagLayout, GridBagConstraints gridBagConstraints) {
        gridBagLayout.setConstraints(c, gridBagConstraints);
        container.add(c);
    }
}
