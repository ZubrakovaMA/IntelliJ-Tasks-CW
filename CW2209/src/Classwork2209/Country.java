package Classwork2209;

import java.util.Objects;

public class Country {

    public String name = "";
    public String continent = "";

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(name, country.name) &&
                Objects.equals(continent, country.continent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, continent);
    }

    public Country(String name, String continent) {
        this.name = name;
        this.continent = continent;
    }

    @Override
    public String toString() {
        return "Country: " + name + ", Continent: " + continent;
    }
}
