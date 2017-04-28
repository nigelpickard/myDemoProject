package com.npickard;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by npickard on 4/28/2017.
 */
@RestController("MyRESTController")
public class MyRESTController {

    @RequestMapping(value = "/blah", method = RequestMethod.GET)
    public String getTestMessage(HttpServletRequest request) throws Exception {
        return "blah!";
    }

    @RequestMapping(value = "/car", method = RequestMethod.GET)
    public Car getCar(HttpServletRequest request) throws Exception {
        Car car = new Car();
        car.setModelName("Ford Anglia");
        car.setNumberOfWheels(4);
        car.setType("Saloon");
        return  car;
    }


    @RequestMapping(value = "/car/add", method = RequestMethod.POST)
    public ResponseEntity<Car> addCar(HttpServletRequest request, @RequestBody Car car) throws Exception {
        System.out.println("Adding car: " + car.getModelName());
        return new ResponseEntity<Car>(car, HttpStatus.OK);
    }
}
