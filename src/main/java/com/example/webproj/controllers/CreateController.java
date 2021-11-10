package com.example.webproj.controllers;

import com.example.webproj.StaticShoppingList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CreateController {
    @GetMapping(path = "/list/new")
    public String create(Model model) {
        return "create";
    }

    @PostMapping(path = "/list")
    private String doCreate(@ModelAttribute("text") String text) {
        StaticShoppingList.add(text);
        return "redirect:/list";
    }
}
