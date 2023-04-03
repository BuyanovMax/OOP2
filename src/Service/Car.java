package Service;

public class Car extends Transport {


    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    @Override
    public void checkTrailer() {
    }
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
}
