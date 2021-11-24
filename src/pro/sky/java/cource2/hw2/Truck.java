package pro.sky.java.cource2.hw2;

public class Truck extends Transports {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку на тягаче");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель тягача");
    }

    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}