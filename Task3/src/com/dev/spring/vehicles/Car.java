package com.dev.spring.vehicles;

import com.dev.spring.DatabaseOperations;
import com.dev.spring.Vehicle;

public class Car implements Vehicle {
    private DatabaseOperations operations;
    public Car(DatabaseOperations operations){
        this.operations=operations;
    }
    @Override
    public void save(String brand) {
        operations.connect();
        operations.save(brand);
    }
}
