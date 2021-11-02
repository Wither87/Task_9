package com.example.webproj.controllers;

import com.example.webproj.StaticShoppingList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DeleteController {
    @RequestMapping(path = "/list/{id}", method = RequestMethod.POST)
    private String delete(@PathVariable("id") int id) {
        StaticShoppingList.remove(id);
        return "redirect:/list";
    }
}
