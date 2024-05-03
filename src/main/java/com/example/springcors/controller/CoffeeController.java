package com.example.springcors.controller;

import com.example.springcors.model.Coffee;
import com.example.springcors.model.Size;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/coffee")
public class CoffeeController {
    private List<Coffee> coffeeList = new ArrayList<>();

    public CoffeeController() {
        coffeeList.add(new Coffee(1, "Caffe Americano", Size.GRANDE));
        coffeeList.add(new Coffee(2, "Caffee Latte", Size.VENTI));
        coffeeList.add(new Coffee(3, "Caffe Caremel Macchiato", Size.TALL));
    }

    @GetMapping
    public List<Coffee> findAll() {
        return coffeeList;
    }

    @DeleteMapping
    public void delete(Integer id) {
        coffeeList.removeIf(coffee -> coffee.id().equals(id));
    }
}
