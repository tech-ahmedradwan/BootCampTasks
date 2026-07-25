package main.com.myApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;
import java.time.Period;

@Controller
public class AgeCalculatorController {
    @RequestMapping("/")
    public String showAgeForm(){
        return "ageFormPage";
    }

    @RequestMapping("/calculate")
    public String calculateAge(@RequestParam("year") String year,@RequestParam("month") String month,@RequestParam("day") String day, Model model){

        LocalDate dateTime = LocalDate.now();
       LocalDate birthDate = LocalDate.of(Integer.parseInt(year),Integer.parseInt(month),Integer.parseInt(day));
       Period period =  Period.between(birthDate,dateTime);


       model.addAttribute("year",period.getYears());
       model.addAttribute("month",period.getMonths());
       model.addAttribute("day",period.getDays());
        return "ResultPage";
    }
}
