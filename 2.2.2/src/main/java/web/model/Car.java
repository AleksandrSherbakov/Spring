package web.model;

public class Car {
    private String model;
    private String series;
    private int power;

    public Car(String model, String series, int power) {
        this.model = model;
        this.series = series;
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
