package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private Integer series;
    private Integer wheels;
    private String model;

    public Car() {

    }

    public Car(Integer series, Integer wheels, String model) {
        this.series = series;
        this.wheels = wheels;
        this.model = model;
    }

    public Integer getSeries() {
        return series;
    }

    public void setSeries(Integer series) {
        this.series = series;
    }

    public Integer getWheels() {
        return wheels;
    }

    public void setWheels(Integer wheels) {
        this.wheels = wheels;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "series=" + series +
                ", wheels=" + wheels +
                ", model='" + model + '\'' +
                '}';
    }
}
