package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class WebService {
      @GetMapping(value="/")
      public String helloBonjour(){
          return "Bonjour !";
      }


        ArrayList<Car> cars = new ArrayList<Car>();
        public WebService(){
            Car car = new Car();
            car.setPlateNumber("11AA22");
            cars.add(car);
            car = new Car();
            car.setPlateNumber("22BB33");
            cars.add(car);
        }

        @GetMapping("/cars")
        ArrayList<Car> getListOfCars(){
            return cars;
        }

        @GetMapping("/cars/{plaque}")
        Car getCar(@PathVariable(value = "plaque") String immatriculation){
            System.out.println(immatriculation);
            // parcourir avec une boucle le tableau des voitures à la recherche de la voiture qui a la plaque immatriculation
            return null;
        }





}
