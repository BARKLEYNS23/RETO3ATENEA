package com.example.ret3.Controller;

import com.example.ret3.Model.Car;
import com.example.ret3.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RestController
@RequestMapping("/api/Car")
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping("/all")   // ->>>>  localhost..../api/Car/all
    public List<Car> getAll(){
        return carService.getAll();
    }

    @GetMapping("/{id}")    // ->>>>  localhost..../api/Car/12
    public Optional<Car> getCar(@PathVariable int id){
        return carService.getCar(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Car save(@RequestBody Car car){
        return carService.save(car);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Car update(@RequestBody Car car){
        return carService.update(car);
    }

    @DeleteMapping("/{id}")    // -----> localhost...../api/Car/12
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable int id) {
        return carService.delete(id);
    }
}
