package de.torben.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Controllers{
    
    @RequestMapping(value = "/validate", method = RequestMethod.GET)
    public String validateForm(Model model) {
        model.addAttribute("ibanBicForm", new IbanBicForm());
        return "index";
    }
    
    @RequestMapping(value="/validate", method=RequestMethod.POST)
    public String validateSubmit(@ModelAttribute IbanBicForm ibanBicForm, Model model) {
        model.addAttribute("ibanBicForm", ibanBicForm);
        return "result";
    }
    
    @RequestMapping("/test")
    @ResponseBody
    String index() {
        return "<h1>Test</h1>";
    }

}
