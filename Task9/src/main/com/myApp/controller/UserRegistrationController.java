package main.com.myApp.controller;

import main.com.myApp.models.UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserRegistrationController {

    @RequestMapping("/")
    public String showUserRegistrationForm(Model model){
        model.addAttribute("userProfileModel",new UserModel());
        return "registrationForm";
    }

    @RequestMapping("/confirmation")
    public String showConfirmUserProfile(@ModelAttribute("userProfileModel") UserModel userModel,Model model){
        model.addAttribute("userProfileModel",userModel);
        return "confirmForm";
    }
}
