package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.service.UserService;

@Controller
public class UsersController {

    private final UserService userService;

    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")// то что указывается в браузере
    public String getAllUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "index";// на какую hml страницу смотримxs
    }
//
//    @GetMapping("/{id}")
//    public String showUser(@PathVariable("id") int id, Model model) {
//        model.addAttribute("user", userService.showUser(id));
//        return "/show";
//    }

    @PostMapping("/edit")
    public String update(@ModelAttribute("user") User user) {
        userService.update(user);
        return "redirect:/";
    }

    @GetMapping("/{id}")
    public String editUser(@PathVariable("id") int id, Model model){
        model.addAttribute("user",userService.showUser(id));
        return "edit";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") int id) {
        userService.delete(id);
        return "redirect:/";
    }

    @GetMapping("/new")
    public String newUser(Model model) {
        model.addAttribute("user", new User());
        return "new";
    }

    @PostMapping(value = "/save")
    public String save(@ModelAttribute("user") User user) {
        userService.save(user);
        return "redirect:/";
    }
}