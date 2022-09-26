package Classwork2209;

public class CountMain {
        public static void main(String[] args) {
            Country country = new Country("Belarus", "Europa");
            Country country2 = new Country("Belarus", "Europa");
            Country country3 = new Country("Belarus", "Europa");

            City city = new City("Vitebsk", 300000);
            City city2 = new City("Minsk", 140000);
            City city3 = new City("Gomel", 29000);

            System.out.println(country.toString() + city.toString());
            System.out.println(country2.toString() + city2.toString());
            System.out.println(country3.toString() + city3.toString());
        }
    }

