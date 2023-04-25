package swing;

import java.awt.*;

public class GridBagLayoutDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("这里是GridBagLayout测试");
        GridBagLayout gb1 = new GridBagLayout();//创建一个GridBagLayout对象
        frame.setLayout(gb1);//把当前这个Frame对象的布局管理器设置为GridBagLayout
        GridBagConstraints gbc = new GridBagConstraints();//创建一个GridBagConstraints对象
        Button[] bt = new Button[10];//创建一个容量为10的Button数组
        for (int i = 0; i < bt.length; i++) {
            bt[i] = new Button("按钮" + (i + 1));
        }//遍历数组初始化每一个Button
        gbc.fill = GridBagConstraints.BOTH;
        //设置所有的GridBagConstraints对象的fill属性为GridBagConstraints.BOTH，当有空白区域时，组件自动扩大沾满空白区域
        gbc.weightx = 1;//设置GridBagConstraints对象的weightx设置为1，表示横向扩展比例为1
        //往frame中添加数组中的前三个Button
        addComponent(frame, bt[0], gb1, gbc);
        addComponent(frame, bt[1], gb1, gbc);
        addComponent(frame, bt[2], gb1, gbc);
        //把GridBagConstraints的gridwideth设置为GridBagConstraints.REMAINDER,表明当前组件是横向最后一个组件
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        addComponent(frame, bt[3], gb1, gbc);//把Button数组的第四个按钮添加到frame中
        gbc.weighty = 1;//设置GridBagConstraints对象的weighty设置为1，表示纵向扩展比例为1
        addComponent(frame, bt[4], gb1, gbc);//把Button数组的第五个按钮添加到frame中
        gbc.gridheight = 2;
        gbc.gridwidth = 2;
        //把Button数组的gridheight和gridwidth设置为2，表示纵向和横向会占用两个网格
        addComponent(frame, bt[5], gb1, gbc);//把Button数组的第六个按钮添加到frame中
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        //把Button数组的gridheight和gridwidth设置为1，表示纵向和横向会占用一个网格
        addComponent(frame, bt[6], gb1, gbc);//把Button数组的第七个按钮添加到frame中
        //把GridBagConstraints的gridwideth设置为GridBagConstraints.REMAINDER,表明当前组件是横向最后一个组件
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        addComponent(frame, bt[7], gb1, gbc);//把Button数组的第八个按钮添加到frame中
        gbc.gridwidth = 1;
        //把Button数组的gridwidth设置为1，表示纵向会占用一个网格
        addComponent(frame, bt[8], gb1, gbc);//把Button数组的第九个按钮添加到frame中
        addComponent(frame, bt[9], gb1, gbc);//把Button数组的第十个按钮添加到frame中
        frame.pack();
        frame.setVisible(true);
    }

    public static void addComponent(Container container, Component c, GridBagLayout gridBagLayout, GridBagConstraints gridBagConstraints) {
        gridBagLayout.setConstraints(c, gridBagConstraints);
        container.add(c);
    }
}
