public class type {
        /*public static String getType(Object test) {
            return test.getClass().getName().toString();

        }*/
        public static void main(String[] args) {
            System.out.println((short)10+'B');
            System.out.println('Ì×'+'·¢');
            System.out.println((int)3.25+10.0);
            System.out.println(5.0/2+10);
            int i=8,j=010;
            System.out.println((int)j);
            if(i>j)
                i--;
            else
                j--;
            System.out.println(j);
        }
}
