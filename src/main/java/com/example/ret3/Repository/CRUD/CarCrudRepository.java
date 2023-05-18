package com.example.ret3.Repository.CRUD;

import com.example.ret3.Model.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarCrudRepository extends CrudRepository<Car, Integer> {
}
