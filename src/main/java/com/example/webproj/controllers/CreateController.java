package com.example.webproj.controllers;

import com.example.webproj.StaticShoppingList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CreateController {
    @RequestMapping(path = "/list/new", method = RequestMethod.GET)
    public String create(Model model) {
        return "create";
    }

    @RequestMapping(path = "/list", method = RequestMethod.POST)
    private String doCreate(@ModelAttribute("text") String text) {
        StaticShoppingList.add(text);
        return "redirect:/list";
    }
}
