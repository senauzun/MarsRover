package marsrover;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MarsRoverTest {

    public Rover rover;

    @Before
    public void applyNumber() {
        Coordinates coordinates = new Coordinates();
        CardinalPoint cardinalPoint = new CardinalPoint(CardinalPoint.NORTH);
        rover = new Rover(coordinates, cardinalPoint);
    }

    @Test
    public void canProvideCurrenctLocation(){
        Coordinates startingPosition = new Coordinates(3,3);
        CardinalPoint startDirection = new CardinalPoint(CardinalPoint.EAST);
        Rover robotic = new Rover(startingPosition,startDirection);
        Assert.assertEquals("3 3 E",robotic.toString());
    }

    @Test
    public void canIncrementCoordinateX() {
        Coordinates coordinates = new Coordinates(4, 4);
        coordinates.incrementX();
        int expected = 5;
        assertEquals(5, coordinates.getX());
    }

    @Test
    public void canDecrementCoordinateX() {
        Coordinates coordinates = new Coordinates(5, 5);
        coordinates.decrementX();
        int expected = 4;
        assertEquals(4, coordinates.getX());
    }

    @Test
    public void canIncrementCoordinateY() {
        Coordinates coordinates = new Coordinates(4, 4);
        coordinates.incrementY();
        int expected = 5;
        assertEquals(5, coordinates.getY());
    }

    @Test
    public void canDecrementCoordinateY() {
        Coordinates coordinates = new Coordinates(5, 5);
        coordinates.decrementY();
        int expected = 4;
        assertEquals(4, coordinates.getY());
    }


    @Test
    public void turnRight90Degrees() {
        rover.turnRight();
        char expected = CardinalPoint.EAST;
        assertEquals(expected, rover.getCardinalPoint());
    }

    @Test
    public void turnRight180Degrees() {
        rover.turnRight();
        rover.turnRight();
        char expected = CardinalPoint.SOUTH;
        assertEquals(expected, rover.getCardinalPoint());
    }


    @Test
    public void turnLeft90Degrees() {
        rover.turnLeft();
        char expected = CardinalPoint.WEST;
        assertEquals(expected, rover.getCardinalPoint());
    }

    @Test
    public void turnLeft180Degrees() {
        rover.turnLeft();
        rover.turnLeft();
        char expected = CardinalPoint.SOUTH;
        assertEquals(expected, rover.getCardinalPoint());
    }

    @Test
    public void turnLeft270Degrees() {
        rover.turnLeft();
        rover.turnLeft();
        rover.turnLeft();
        char expected = CardinalPoint.EAST;
        assertEquals(expected, rover.getCardinalPoint());
    }



    @Test
    public void turnLeft360Degrees() {
        rover.turnLeft();
        rover.turnLeft();
        rover.turnLeft();
        rover.turnLeft();
        char expected = CardinalPoint.NORTH;
        assertEquals(expected, rover.getCardinalPoint());
    }

    @Test
    public void moveNorth() {
        rover.moveForward();
        int y = 1;
        int x = 0;
        assertEquals(y, rover.getCoordinates().getY());
        assertEquals(x, rover.getCoordinates().getX());
    }

    @Test
    public void moveEast() {
        rover.turnRight();
        rover.moveForward();
        int y = 0;
        int x = 1;
        assertEquals(y, rover.getCoordinates().getY());
        assertEquals(x, rover.getCoordinates().getX());
    }



}
