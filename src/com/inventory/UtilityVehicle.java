package com.inventory;

public class UtilityVehicle extends Car{

    private boolean fourWheelDrive = true;

    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }


    @Override
    public String getinfo(){
        return super.getinfo() +
                "Tiene cuatro ruedas: " + fourWheelDrive;
    }

}
