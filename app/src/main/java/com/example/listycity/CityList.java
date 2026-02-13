package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps a list of city objects
 */
public class CityList {
    private final List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     *
     * @param city This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     *
     * @return Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * @return {@code true} if the city is in the list, otherwise {@code false}
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * @return {@code true} if the city is removed from the list
     * @throws IllegalArgumentException if the {@link City} does not contain the city
     */
    public boolean deleteCity(City city) throws IllegalArgumentException {
        if (!cities.contains(city))
            throw new IllegalArgumentException();

        return cities.remove(city);
    }

    /**
     * @return the number of cities in the list
     */
    public int countCities() {
        return cities.size();
    }
}
