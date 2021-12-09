package web.model;

import java.util.List;

public class Car {
    private String model;
    private String series;
    private int speed;
    private List<Car> cars;


    public Car(String model, String series, int speed) {
        this.model = model;
        this.series = series;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public String getSeries() {
        return series;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Car{ " +
                "model='" + model + '\'' +
                ", series='" + series + '\'' +
                ", speed=" + speed +
                '}';
    }
}
