package edu.avada.course.controller;


import edu.avada.course.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("test")
@Controller
public class SomeController {

    @GetMapping("/{number}")
    public String test1(
            Model model,
            @PathVariable int number) {
        model.addAttribute("number", number);
        return "test_page";
    }

    @ModelAttribute
    public User getUser() {
        return new User();
    }

    @PostMapping("/add")
    public String addUser(@ModelAttribute(name = "user") User user, @RequestParam String name) {
        // TODO

        return "some_form";
    }
}
