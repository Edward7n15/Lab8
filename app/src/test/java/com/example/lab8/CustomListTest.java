package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size plus
     one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount(); // now it's 4
        list.addCity(new City("Estevan", "SK"));
        assertEquals(listSize + 1, list.getCount()); // now it's 5
    }

    /**
     * Check if the given city is in the list.
     * @param cityName The name of the city to check.
     * @return True if the city is in the list, false otherwise.
     */
    /**
     * Tests if CustomList.hasCity() method returns true for cities that have been added
     * to the CustomList, and false for cities that have not been added.
     */
    @Test
    public void testHasCity() {
        CustomList list = new CustomList(null, new ArrayList<>());

        City city1 = new City("Edmonton", "AB");
        City city2 = new City("Canmore", "AB");

        list.addCity(city1);
        list.addCity(city2);

        Assert.assertTrue(list.hasCity(city1));
        Assert.assertTrue(list.hasCity(city2));
        Assert.assertFalse(list.hasCity(new City("Toronto", "ON")));
    }
}
