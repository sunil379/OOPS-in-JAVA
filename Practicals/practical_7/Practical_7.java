package practical_7;
/*
Practical No. :- 7 
Q.7] A vehicle has engine no and chassis number. It can be locked, unlocked. Every vehicle is movable (interface). 
It can be started, stopped, turned, accelerated, turned, and decelerated. A car is a vehicle. It has steering. An 
airplane is a vehicle. It has wings. A boat is a vehicle. It has propeller.
*/


interface VehicleProperties {
    void start();
    void stop();
    void accelerate();
    void decelerate();
    void turn();
    void lock();
    void unlock();
}

abstract class Vehicle implements VehicleProperties {
    protected int engineNo, chassisNo;
    protected boolean isLocked = false;

    public Vehicle(int engineNo, int chassisNo) {
        this.engineNo = engineNo;
        this.chassisNo = chassisNo;
    }

    public void start() {
        System.out.println("Vehicle started.");
    }

    public void stop() {
        System.out.println("Vehicle stopped.");
    }

    public void accelerate() {
        System.out.println("Vehicle accelerating.");
    }

    public void decelerate() {
        System.out.println("Vehicle decelerating.");
    }

    public void turn() {
        System.out.println("Vehicle turning.");
    }

    public void lock() {
        isLocked = true;
        System.out.println("Vehicle locked.");
    }

    public void unlock() {
        isLocked = false;
        System.out.println("Vehicle unlocked.");
    }
}

class Car extends Vehicle {
    public Car(int engineNo, int chassisNo) {
        super(engineNo, chassisNo);
    }

    public void steering() {
        System.out.println("Car is using steering.");
    }
}

class Boat extends Vehicle {
    public Boat(int engineNo, int chassisNo) {
        super(engineNo, chassisNo);
    }

    public void usePropeller() {
        System.out.println("Boat is using propeller.");
    }
}

class Airplane extends Vehicle {
    public Airplane(int engineNo, int chassisNo) {
        super(engineNo, chassisNo);
    }

    public void useWings() {
        System.out.println("Airplane is using wings.");
    }
}

public class Practical_7 {
    public static void main(String[] args) {
        Car c = new Car(1234, 56789);
        Boat b = new Boat(2345, 67890);
        Airplane a = new Airplane(3456, 78901);

        System.out.println("Car operations:");
        c.unlock();
        c.start();
        c.steering();
        c.accelerate();
        c.turn();
        c.decelerate();
        c.stop();
        c.lock();

        System.out.println("\nBoat operations:");
        b.unlock();
        b.start();

        System.out.println("Aeroplane operation:");
        a.useWings();
    }
}
