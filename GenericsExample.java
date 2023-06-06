public class GenericsExample {
    public static void main(String[] args) {
//            Printer<Integer> pt= new Printer<>(23);
//            pt.print();
//            Printer<Double> dpt= new Printer<>(23.5);
//            dpt.print();
        shout("Alex", 57);
//            shout(57);
    }

    public static <T, V> T shout(T thingToShout, V otherThingToShout) {
        System.out.println(thingToShout + "!!!!");
        System.out.println(otherThingToShout + "!!!!");
        return thingToShout;
    }
}
