package com.example.webproj.controllers;

import com.example.webproj.StaticShoppingList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BuyController {
    @PostMapping(path = "/list/{id}/buy")
    private String buy(@PathVariable("id") int id) {
        StaticShoppingList.get(id).setIsBought();
        return "redirect:/list";
    }
}
