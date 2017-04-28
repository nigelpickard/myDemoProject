package com.npickard;

/**
 * Created by npickard on 4/28/2017.
 */
public class Passenger {

    private String firstName;
    private String lastName;
    private int age;

    public Passenger(){

    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Passenger passenger = (Passenger) o;

        if (age != passenger.age) return false;
        if (firstName != null ? !firstName.equals(passenger.firstName) : passenger.firstName != null) return false;
        return lastName != null ? lastName.equals(passenger.lastName) : passenger.lastName == null;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }

}
