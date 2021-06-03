package com.example.demo.services;

import com.example.demo.entity.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceImpl implements UserService {
    private static ArrayList<User> users = new ArrayList<User>();

    static {
        users.add(new User(1,
                "The Last Jedi",
                "jedi13@gmail.com",
                "0898213745",
                "https://source.unsplash.com/random",
                "thelastjedi"));

        users.add(new User(2,
                "Han Solo",
                "hansolo10@gmail.com",
                "0898213745",
                "https://source.unsplash.com/random",
                "hansolo"));

        users.add(new User(3,
                "The Mandalorian",
                "mandalorian1000@gmail.com",
                "0898213745",
                "https://source.unsplash.com/random",
                "thisistheway"));
    }

    @Override
    public List<User> getListUser() {
        return null;
    }
}
