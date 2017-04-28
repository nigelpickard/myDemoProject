package com.npickard;

/**
 * Created by npickard on 4/28/2017.
 */
public class Engine {

    private double sizeInLitres;
    private int numberOfCylinders;

    public Engine(){}

    public double getSizeInLitres() {
        return sizeInLitres;
    }

    public void setSizeInLitres(double sizeInLitres) {
        this.sizeInLitres = sizeInLitres;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Engine engine = (Engine) o;

        if (Double.compare(engine.sizeInLitres, sizeInLitres) != 0) return false;
        return numberOfCylinders == engine.numberOfCylinders;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(sizeInLitres);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + numberOfCylinders;
        return result;
    }
}
