package sweeper;

public class Coord {
    public int x;
    public int y;

    public Coord(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Coord) {
            Coord to = (Coord) obj;
            return this.x == to.x && this.y == to.y;
        }
        return super.equals(obj);
    }
}
