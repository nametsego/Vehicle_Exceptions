package AntiElite.com;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();
        Skateboard skateboard = new Skateboard();

        Vehicle[] racers = {car,bicycle,boat,skateboard};

        for(Vehicle x : racers) {
            x.go();
        }



    }
}
