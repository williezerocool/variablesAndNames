/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variablesandnames;

/**
 *
 * @author kendrabooker
 */
public class VariablesAndNames {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int cars, drivers, passengers, cars_not_driven, cars_driven;
        double space_in_a_car, carpool_capacity, average_passengers_per_car;
        // a single = is an assignment operator

        cars = 100; // assign 100 to the int var car
        //assigning 4.0 to the int space_in_a_car and nothing happens when you change the value to a whole number
        space_in_a_car = 4.0;
        //assigning the value of 30 to the int drivers
        drivers = 30;
        //assigning the value of 90 to the int passengers
        passengers = 90;
        //cars_not_driven equals an expression
        cars_not_driven = cars - drivers;
        //car_driven equals the value of drivers
        cars_driven = drivers;
        //carpool_capacity equals an expression
        carpool_capacity = cars_driven * space_in_a_car;
        //average_passengers_per_car equals an expression
        average_passengers_per_car = passengers / cars_driven;
        //string + the value of the int cars + another string is printed
        System.out.println("There are " + cars + " cars available.");
        //string + the value of the int drivers + another string is printed
        System.out.println("There are only " + drivers + " drivers available.");
        //string + the value of the int cars_not_driven + another string is printed
        System.out.println("There will be " + cars_not_driven + " empty cars today.");
        //string + the value of the int carpool_capacity + another string is printed
        System.out.println("We can transport " + carpool_capacity + " people today.");
        //string + the value of the int passengers + another string is printed
        System.out.println("We have " + passengers + " to car pool today.");
        //string + the value of the int average_passengers_per_car + another string is printed
        System.out.println("We need to put about " + average_passengers_per_car + " in each car.");
        
    }
    
}
