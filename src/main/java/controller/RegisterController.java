package controller;

import entity.LoginEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.RegisterService;

@RestController
@RequestMapping("/register")
public class RegisterController {
    @Autowired
    private RegisterService service;
    @PostMapping
    public String reg(@RequestBody LoginEntity entity){
        int a=service.RegisterCheck(entity);
        if(a==1) {
            service.Rsave(entity);
            return "Registered Successfully";
        }
        else{
            return "Enter a valid user and mail";
        }
    }
}
