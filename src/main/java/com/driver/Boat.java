package com.driver;

public class Boat implements WaterVehicle{
      String name;
      int Capacity;
      Boat(String name,int Capacity){
          this.name = name;
          this.Capacity = Capacity;
      }
    @Override
    public String getVehicleName() {
        return name;
    }

    @Override
    public int getVehicleCapacity() {
        return Capacity;
    }
}
