package marsrover;//


public class Coordinates {
    private int x;
    private int y;

    public Coordinates() {
        this.x = 0;
        this.y = 0;
    }

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void incrementX() {

        ++this.x;
    }

    public void incrementY() {

        ++this.y;
    }




    public void decrementX() {
        --this.x;
    }

    public void decrementY() {
        --this.y;
    }

    public String toString() {
        return this.x + " " + this.y;
    }
}
