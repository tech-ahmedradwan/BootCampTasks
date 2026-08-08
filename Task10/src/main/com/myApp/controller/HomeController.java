package main.com.myApp.controller;

import main.com.myApp.models.User;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.sql.*;

@Controller
public class HomeController
{

    @RequestMapping("/")
    public String showHomePage(Model model)
    {
        model.addAttribute("userModel", new User());
        return "form";
    }

    @RequestMapping("/process")
    public String processHomePage(@Valid @ModelAttribute("userModel") User user, BindingResult result, Model model)
    {

        if (result.hasErrors() )
            return "form";

        model.addAttribute("userModel",user);
      try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection conn = DriverManager.getConnection(
                  "jdbc:mysql://localhost:3307/RegestrationDB",
                  "root",
                  "root"
          );
          PreparedStatement stmt = conn.prepareStatement(
                  "insert into userRegistration(username,email,password,confirmpassword) values (?,?,?,?)");
          stmt.setString(1,user.getUserName());
          stmt.setString(2,user.getEmail());
          stmt.setString(3,user.getPassword());
          stmt.setString(4,user.getConfirmPassword());
          int rs = stmt.executeUpdate();
          System.out.printf("%d queries inserted.\n", rs);

          stmt.close();
          conn.close();
      } catch (SQLException e) {
          System.out.println(e.getMessage());
      } catch (ClassNotFoundException e) {
	      throw new RuntimeException(e);
      }
	    return "processForm";
    }

    @InitBinder
    public void initBinder(WebDataBinder binder){
        StringTrimmerEditor stringTrimmer = new StringTrimmerEditor(true);
        binder.registerCustomEditor(String.class,stringTrimmer);
    }
}