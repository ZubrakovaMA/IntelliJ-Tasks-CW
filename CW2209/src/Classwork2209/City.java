package Classwork2209;

import java.util.Objects;

public class City {

    public String country = "";
    public String name = "";
    public int countOfPeople = 0;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return countOfPeople == city.countOfPeople &&
                Objects.equals(country, city.country) &&
                Objects.equals(name, city.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, name, countOfPeople);
    }

    public City(String name, int countOfPeople) {
        this.name = name;
        this.countOfPeople = countOfPeople;
    }

    @Override
    public String toString() {
        return ", City: " + name + ", countOfPeople=" + countOfPeople;
    }
}


