/*
Question:
How can you create an immutable point class with private final int x, y, only constructor and getters, and no setters?
*/
class ImmutablePoint {
    private final int x;
    private final int y;

    ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }

    public static void main(String[] args) {
        ImmutablePoint point = new ImmutablePoint(4, 7);
        System.out.println(point);
        System.out.println("x = " + point.getX());
        System.out.println("y = " + point.getY());
    }
}
