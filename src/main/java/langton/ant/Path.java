package langton.ant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author JYX
 * @since 2021/1/29 10:13
 */
public class Path {

    private final Map<String,Position> positionInPath = new HashMap<>();

    private Position lastPosition;

    private Direction lastDirection;

    private final Limit limit = new Limit();

    public void recordTrace(Position position,Direction direction){
        this.lastPosition = position;
        this.lastDirection = direction;
        this.positionInPath.putIfAbsent(position.generateId(),position);
        this.limit.changeLimit(position.getCoordinate());
    }

    public boolean contains(Coordinate coordinate){
        return this.positionInPath.containsKey(coordinate.generateId());
    }

    public Position getPosition(Coordinate coordinate){
        return this.positionInPath.get(coordinate.generateId());
    }

    public List<String> print(){
        List<String> result = new ArrayList<>();
        for(int y=this.limit.getMaxY() ; y>=this.limit.getMinY() ; y--){
            StringBuilder row = new StringBuilder();
            for(int x=this.limit.getMinX() ; x<=this.limit.getMaxX() ; x++){
                Coordinate coordinate = new Coordinate(x,y);
                Position position;
                if(contains(coordinate)){
                    position = getPosition(coordinate);
                }else {
                    position = new Position(coordinate);
                }

                if(lastPosition.equals(position)){
                    row.append(lastDirection.getValue());
                }else {
                    row.append(position.getColor().getValue());
                }
            }
            result.add(row.toString());
        }
        return result;
    }

}
