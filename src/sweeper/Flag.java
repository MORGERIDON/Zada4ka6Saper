package sweeper;

class Flag {

    private Matrix flagMap;
    private int totalFlags;
    private int countOfClosedBoxes;

    public void start() {
        flagMap = new Matrix(Box.CLOSED);
    }

    public Box get(Coord coord) {
        return flagMap.get(coord);
    }

    public void setOpenedToBox(Coord coord) {
        if (flagMap.get(coord) != Box.FLAGGED)
            flagMap.set(coord, Box.OPENED);
    }

    public void setBombedToBox(Coord coord) {

    }

    public void toggleFlagedToBox(Coord coord) {
        switch (flagMap.get(coord)) {
            case FLAGGED -> {
                setClosedToBox(coord);
                break;
            }
            case CLOSED -> {
                setFlagedToBox(coord);
                break;
            }
        }
    }

    private void setClosedToBox(Coord coord) {
        flagMap.set(coord, Box.CLOSED);
    }

    public void setNoBombToFlagedSafeBox(Coord coord) {

    }

    public void setOpenedToClosedSafeBox(Coord coord) {

    }

    public int getCountOfFlagedBoxesAround(Coord coord) {
        return 0;
    }

    public int getCountOfClosedBoxes(Coord coord) {
        return 0;
    }

    public int getTotalFlags() {
        return 0;
    }

    public void setFlagedToBox(Coord coord) {
        flagMap.set(coord, Box.FLAGGED);
    }
}
