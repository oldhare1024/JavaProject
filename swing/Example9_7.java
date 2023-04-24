package swing;

public class Example9_7 {
    public static void main(String[] args) {
        WindowActionEvent1 win = new WindowActionEvent1();
        PoliceListen police = new PoliceListen();//创建监视器
        win.setMyCommandListener(police);//窗口组合监视器
        win.setBounds(100, 100, 640, 480);
        win.setTitle("处理ActionEvent事件(字符串统计长度)");
    }
}
