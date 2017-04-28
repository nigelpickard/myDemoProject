package com.npickard;

/**
 * Created by npickard on 4/28/2017.
 */
public class Car {

    private String modelName;
    private String type;
    private int numberOfWheels;

    public Car(){}

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (numberOfWheels != car.numberOfWheels) return false;
        if (modelName != null ? !modelName.equals(car.modelName) : car.modelName != null) return false;
        return type != null ? type.equals(car.type) : car.type == null;
    }

    @Override
    public int hashCode() {
        int result = modelName != null ? modelName.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + numberOfWheels;
        return result;
    }
}
