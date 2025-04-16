package controller;

import entity.LoginEntity;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.LoginService;

import java.util.List;

@RestController
@RequestMapping("/users")
@Data
public class LoginController {
    @Autowired
    private LoginService login1;

    @PostMapping
    public String Login(@RequestBody LoginEntity login){
        int a=login1.check(login);
        if(a==1)
        return "Logged in Successfully";
        else{
            return "Invalid";
        }
    }
    @GetMapping
    public List<LoginEntity> LoginUsers(){
        return login1.fAll();

    }

}
