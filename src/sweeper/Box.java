package sweeper;

public enum Box {

    ZERO,
    NUM1,
    NUM2,
    NUM3,
    NUM4,
    NUM5,
    NUM6,
    NUM7,
    NUM8,
    BOMB,
    OPENED,
    CLOSED,
    FLAGGED,
    BOMBED,
    NO_BOMB;
    public Object image;

    Box getNextNumberBox() {
        Box.values();
        return Box.values()[this.ordinal() + 1];
    }

    int getNumber() {
        return this.ordinal();
    }
}

