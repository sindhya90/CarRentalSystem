package com.car.rental.model.car;

import com.car.rental.model.car.Car;

/**
 * Created by sindhya on 7/31/17.
 */
public interface VehicleState {

    public String requestCar();
    public String denyCarRequest();
    //public String approveCarRequest();
    public String activateCarListing();
    public String inactivateCarListing();
    public String rentCar();
    public String returnCar();

}
