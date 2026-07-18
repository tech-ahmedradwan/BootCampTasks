package com.dev.spring.vehicles;


import com.dev.spring.DatabaseOperations;
import com.dev.spring.Vehicle;

public class Plane implements Vehicle {
    private DatabaseOperations operations;

    public void setOperations(DatabaseOperations operations) {
        this.operations = operations;
    }

    @Override
    public void save(String brand) {
      operations.save(brand);
    }
}
