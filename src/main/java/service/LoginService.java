package service;

import entity.LoginEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.LoginRepo;

import java.util.List;

@Service
public class LoginService {
    @Autowired
    private LoginRepo Repo;
    public void save(LoginEntity login){
        Repo.save(login);

    }
    public List<LoginEntity> fAll(){
        return Repo.findAll();
    }
    public int check(LoginEntity login){
        if(Repo.existsByEmail(login.getName() ,login.getPassword())){
            return 1;
        }
        else{
            return 0;
        }



    }

}
