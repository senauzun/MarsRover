package marsrover;
import java.util.Scanner;



public class Calculate {

    public Calculate() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxX = 5;
        int maxY = 5;

        System.out.print("Enter x :");
        Integer coordX = scanner.nextInt();
        System.out.print("Enter y:");
        Integer coordY = scanner.nextInt();

        if (coordX > maxX || (coordY > maxY)) {
            System.err.println("Out of bounds");
            System.exit(0);

        }


        Scanner src = new Scanner(System.in);
        System.out.print("Enter Direction ( N,S,W,E):");
        String dir = src.nextLine();

        System.out.print("Enter Command ( L,R,M): ");
        String commands1 = src.nextLine();


        Coordinates coordinates = new Coordinates(coordX, coordY);
        char cardinalPointChar = dir.charAt(0);

        // take many commands for calculate different position and directions
        char[] command = commands1.toCharArray();

        CardinalPoint cardinalPoint = new CardinalPoint(cardinalPointChar);
        Rover rover = new Rover(coordinates, cardinalPoint);

        if (coordX == maxX && coordY == maxY) {
            rover.turnLeft();
            Directions.execute(rover, command);
        }else
            Directions.execute(rover, command);


    }

}


