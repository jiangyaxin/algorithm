package langton.ant;

/**
 * @author JYX
 * @since 2021/1/29 11:15
 */
public class Limit {

    private int minX = 0;
    private int minY = 0;
    private int maxX = 0;
    private int maxY = 0;

    public void changeLimit(Coordinate coordinate){
        int x = coordinate.getX();
        int y = coordinate.getY();

        this.minX = Math.min(x, this.minX);
        this.minY = Math.min(y, this.minY);
        this.maxX = Math.max(x, this.maxX);
        this.maxY = Math.max(y, this.maxY);
    }

    public int getMinX() {
        return minX;
    }

    public int getMinY() {
        return minY;
    }

    public int getMaxX() {
        return maxX;
    }

    public int getMaxY() {
        return maxY;
    }
}
