package langton.ant;

import java.util.List;

/**
 * @author JYX
 * @since 2021/1/29 9:20
 */
public class Ant {

    private Position currentPosition;
    private Direction currentDirection;
    private final MoveCount moveCount;
    private final Path path;

    public Ant(){
        this.currentPosition = new Position(new Coordinate(0,0));
        this.currentDirection = Direction.RIGHT;
        this.moveCount = new MoveCount();
        this.path = new Path();
        this.path.recordTrace(currentPosition, currentDirection);
    }

    public void move(){
        Color currentPositionColor = currentPosition.getColor();
        Coordinate currentPositionCoordinate = currentPosition.getCoordinate();

        Direction newDirection = currentDirection.rotate(currentPositionColor);
        Coordinate newCoordinate = currentPositionCoordinate.change(newDirection);
        Position newPosition = path.contains(newCoordinate) ? path.getPosition(newCoordinate) : new Position(newCoordinate);

        currentPosition.reverseColor();
        this.currentPosition = newPosition;
        this.currentDirection = newDirection;
        path.recordTrace(newPosition,newDirection);
        moveCount.addStep();

    }

    public boolean achieveGoal(int K){
        return this.moveCount.reach(K);
    }

    public List<String> print(){
        return this.path.print();
    }
}
