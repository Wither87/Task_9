package com.example.webproj.controllers;

import com.example.webproj.StaticShoppingList;
import com.example.webproj.models.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ViewController {
    @GetMapping(path="/list")
    public String list(Model model) {
        model.addAttribute("list", StaticShoppingList.getAll());
        return "list";
    }

    @GetMapping(path="/list/{id}")
    public String single(@PathVariable("id") int id, Model model) {
        try {
            Product p = StaticShoppingList.get(id);
            model.addAttribute("item", p);
            return "single";
        }
        catch (Exception e){
            return "redirect:/error404";
        }
    }
}
