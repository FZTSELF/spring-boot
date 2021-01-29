package com.fzt.bootdemo;

import org.springframework.beans.propertyeditors.FileEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

import java.util.List;
import java.util.Map;

@Controller
public class TemplateController {

    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("uname","哈哈哈");
        return "index";
    }

    @PostMapping("/reg")
    @ResponseBody
    public Map reg(@Validated  User user, BindingResult result){
        Map map=new HashMap();
        List<FieldError> editorList=result.getFieldErrors();
       for(FieldError error:editorList){
           map.put(error.getField(),error.getDefaultMessage());
       }

        System.out.println(user);
        return map;
    }
}
