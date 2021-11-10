package com.example.webproj.controllers;

import com.example.webproj.StaticShoppingList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DeleteController {
    //в html метод Delete преобразовывался в Post, поэтому сделал так
    @PostMapping(path = "/list/{id}/delete")
    private String delete(@PathVariable("id") int id) {
        StaticShoppingList.remove(id);
        return "redirect:/list";
    }
}
