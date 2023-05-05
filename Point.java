import java.util.Scanner;

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int distance(Point p) {
        int dx = this.x - p.x;
        int dy = this.y - p.y;
        return (int) Math.sqrt(dx * dx + dy * dy);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);

        System.out.println(p1.distance(p2));
    }
}
