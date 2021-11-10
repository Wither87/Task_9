package com.example.webproj.controllers;

import com.example.webproj.StaticShoppingList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UpdateController {
    //в html метод Put преобразовывался в Post, поэтому сделал так
    @PostMapping(path = "/list/{id}/update")
    private String update(@PathVariable("id") int id,
                          @ModelAttribute("text") String text){
        StaticShoppingList.get(id).setText(text);
        return "redirect:/list";
    }
}
