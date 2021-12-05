package web.model;

public class Car {
    String model;
    String series;
    int speed;

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
