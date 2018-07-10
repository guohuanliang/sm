package com.ghl.control;

import java.sql.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ghl.entity.Ent;
import com.ghl.entity.User;
@Controller
public class UserController {
     @RequestMapping("/save")
     public String save(@Valid User user,BindingResult result){
    	   if(result.hasErrors()) {  

               return "error";  

           }  
    	   return "index";  
     }
     @RequestMapping("/t")
     public ModelAndView t(){
    	 ModelAndView model = new ModelAndView();
    	 Ent ent = new Ent();
    	 model.addObject("ent", ent);
    	 model.setViewName("ent_add");
    	 return model;
     }
 @RequestMapping("/add")
     public ModelAndView a(@Valid Ent e,BindingResult result){
    	 ModelAndView model = new ModelAndView();
    	 model.addObject("ent", e);
    	 model.setViewName("ent_add");
    	 return model;
     }
}
