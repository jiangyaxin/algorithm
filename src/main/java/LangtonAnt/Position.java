package LangtonAnt;

import java.util.Objects;

/**
 * @author JYX
 * @since 2021/1/29 9:59
 */
public class Position {

    private final Coordinate coordinate;
    private Color color;

    public Position(Coordinate coordinate){
        this.coordinate = coordinate;
        this.color = Color.WHITE;
    }

    public void reverseColor(){
        this.color = color.reverse();
    }

    public String generateId(){
        return coordinate.generateId();
    }

    public Color getColor() {
        return color;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Position position = (Position) o;
        return Objects.equals(coordinate, position.coordinate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coordinate);
    }
}
