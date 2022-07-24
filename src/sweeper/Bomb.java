package sweeper;

class Bomb {
    private Matrix bombMap;
    private int totalBombs;

    Bomb(int totalBombs) {
        this.totalBombs = totalBombs;
    }


    void start() {
        bombMap = new Matrix(Box.ZERO);
        placeBomb();

    }

    public Box get(Coord coord) {
        return bombMap.get(coord);
    }

    private void placeBomb() {

        bombMap.set(new Coord(5, 2), Box.BOMB);
    }
}
