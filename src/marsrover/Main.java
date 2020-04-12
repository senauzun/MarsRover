
package marsrover;

/*
            |_N_|_S_|_E_|_W_|
   turnLeft | W | E | N | S |
  turnRight | E | W | S | N |
 moveForward| N | S | E | W |



 */

public class Main {


    public static void main(String[] args) {

        Coordinates coordinates = new Coordinates(1,2);
        CardinalPoint cardinalPoint = new CardinalPoint('N');
        Rover rover = new Rover(coordinates,cardinalPoint);
        Calculate calculate = new Calculate();

        rover.turnLeft();
        System.out.println(rover.toString());

        rover.turnRight();
        System.out.println(rover.toString());

        rover.moveForward();
        System.out.println(rover.toString());

    }
}
