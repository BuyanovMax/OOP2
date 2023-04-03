package Service;

public class Bicycle extends Transport {

    @Override
    public void checkEngine() {
    }
    @Override
    public void checkTrailer() {
    }

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
}
