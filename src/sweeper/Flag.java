package sweeper;

class Flag {

    private Matrix flagMap;
    private int totalFlags;
    private int countOfClosedBoxes;

    public void start() {
        flagMap = new Matrix(Box.CLOSED);
        countOfClosedBoxes = Ranges.getSize().x * Ranges.getSize().y;
    }

    public Box get(Coord coord) {
        return flagMap.get(coord);
    }

    public void setOpenedToBox(Coord coord) {
        if (flagMap.get(coord) != Box.FLAGGED)
            flagMap.set(coord, Box.OPENED);
        countOfClosedBoxes--;
    }

    void setBombedToBox(Coord coord) {
        flagMap.set(coord, Box.BOMBED);
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

    public void setNoBombToFlagedSafeBox(Coord coord)
    {
                if (flagMap.get(coord)==Box.FLAGGED)
                    flagMap.set (coord, Box.NO_BOMB);
    }

    public void setOpenedToClosedSafeBox(Coord coord)
    {
        if (flagMap.get (coord)==Box.CLOSED)
            flagMap.set (coord, Box.BOMBED);

    }

    public int getCountOfFlagedBoxesAround(Coord coord)
    {

        int count = 00;
        for (Coord around : Ranges.getCoordsAround(coord))
            if (flagMap.get (around) == Box.FLAGGED)
        count++;
        return count;
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

    int getCountOfClosedBoxes() {
        return countOfClosedBoxes;
    }
    void setOpenedToClosedBoxesAroundNumber (Coord coord)
    {
        int count = 00;
        for (Coord around : Ranges.getCoordsAround(coord))
            if (flagMap.get (around) == Box.FLAGGED)
                count++;

    }
}
