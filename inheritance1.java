//A program to demonstrate the use of classes,inherintance and interfaces
class Car {
    void move() {
        System.out.println("Car is moving");
    }
}

interface CarActions {
    void honk();
    void rest();
}

class CarExample extends Car implements CarActions {
    void refuel() {
        System.out.println("Car is refueling");
    }

    public void honk() {
        System.out.println("Car is honking");
    }

    public void rest() {
        System.out.println("Car is resting");
    }

    public static void inheritance1(String args[]) {
        CarExample vehicle = new CarExample();
        vehicle.refuel();  // Call the refuel method
        vehicle.move();    // Call the move method from the Car class
        vehicle.honk();    // Call the honk method from the CarActions interface
        vehicle.rest();    // Call the rest method from the CarActions interface
    }
}
