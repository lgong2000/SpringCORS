package com.example.springcors.controller;

import com.example.springcors.model.Coffee;
import com.example.springcors.model.Size;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/coffee")
//@CrossOrigin
//@CrossOrigin(origins = "http://localhost:5174")
public class CoffeeController {
    private List<Coffee> coffeeList = new ArrayList<>();

    public CoffeeController() {
        coffeeList.add(new Coffee(1, "Caffe Americano", Size.GRANDE));
        coffeeList.add(new Coffee(2, "Caffee Latte", Size.VENTI));
        coffeeList.add(new Coffee(3, "Caffe Caremel Macchiato", Size.TALL));
    }

    //@CrossOrigin
    @GetMapping
    public List<Coffee> findAll() {
        return coffeeList;
    }

    //@CrossOrigin(origins = "http://localhost:5174")
    @DeleteMapping
    public void delete(Integer id) {
        coffeeList.removeIf(coffee -> coffee.id().equals(id));
    }
}
