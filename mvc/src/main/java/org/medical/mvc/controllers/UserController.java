package org.medical.mvc.controllers;

import org.medical.model.UserModel;
import org.medical.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView home() {
        List<UserModel> users = userService.listAll();
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("users", users);
        return mav;
    }

    @RequestMapping("/new")
    public String newCustomerForm(Map<String, Object> model) {
        UserModel user = new UserModel();
        model.put("user", user);
        return "new_user";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveCustomer(@ModelAttribute("user") UserModel user) {
        userService.save(user);
        return "redirect:/";
    }

    @RequestMapping("/edit")
    public ModelAndView editCustomerForm(@RequestParam long id) {
        ModelAndView mav = new ModelAndView("edit_user");
        Optional<UserModel> result = userService.get(id);
        UserModel user = result.isPresent() ? result.get() : new UserModel();
        mav.addObject("user", user);
        return mav;
    }

    @RequestMapping("/delete")
    public String deleteCustomerForm(@RequestParam long id) {
        userService .delete(id);
        return "redirect:/";
    }
}
