interface Engine {
    void startEngine();
    void stopEngine();
}

interface Motor {
    void startMotor();
    void stopMotor();
}
class HybridCar implements Engine, Motor {

    @Override
    public void startEngine() {
        System.out.println("Starting petrol engine...");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping petrol engine...");
    }

    @Override
    public void startMotor() {
        System.out.println("Starting electric motor...");
    }

    @Override
    public void stopMotor() {
        System.out.println("Stopping electric motor...");
    }

    public void drive() {
        System.out.println("Hybrid car is driving using both engine and motor!");
    }
}
