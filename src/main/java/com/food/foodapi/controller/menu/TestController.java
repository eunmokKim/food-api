package com.food.foodapi.controller.menu;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/menu")
public class TestController {

    @GetMapping("/api/test")
    public List<String> test(){
        List<String> items = new ArrayList<>();
        items.add("test");
        items.add("test1");
        items.add("test2");
        return items;
    }
}
