package com.omnisphere.streaming.omnisphere_streaming;

import com.omnisphere.streaming.omnisphere_streaming.Model.User;
import com.omnisphere.streaming.omnisphere_streaming.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args){
        System.out.println("Batataaaaa");
        User user = new User();
        user.setName("Batata");
        user.setDescription("Descrioption");
        repository.save(user);
        for(User u: repository.findAll()){
            System.out.println(u.toString());
        }

    }
}
