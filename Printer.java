public class Printer<T, V> {
    T ThingToPrint;
    V OtherThingToPrint;

    public Printer(T thingToPrint) {
        this.ThingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(ThingToPrint);
    }
}
