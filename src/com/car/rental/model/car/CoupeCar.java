package com.car.rental.model.car;

import com.car.rental.model.user.Owner;

/**
 * Created by sindhya on 8/1/17.
 */
public class CoupeCar extends Car {

    public CoupeCar(String vehicleColor, String registrationNumber, int passengerCapacity, Location location, CarType carType, CarMake carMake, FuelType fuelType, TransmissionType transmissionType, Owner owner, Float price) {
        super(vehicleColor,registrationNumber,passengerCapacity,location,carType,carMake,fuelType,transmissionType,owner,price);
    }
}
