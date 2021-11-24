package pro.sky.java.cource2.hw2;

public class Bicycle extends Transports {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку на велосипеде");
    }
}
