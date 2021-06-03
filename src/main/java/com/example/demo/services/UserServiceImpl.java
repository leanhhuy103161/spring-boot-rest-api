package com.example.demo.services;

import com.example.demo.entity.User;
import com.example.demo.exception.NotFoundException;
import com.example.demo.model.dto.UserDto;
import com.example.demo.model.mapper.UserMapper;
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
    public List<UserDto> getListUser() {
        List<UserDto> result = new ArrayList<UserDto>();
        for (User user: users) {
            result.add(UserMapper.toUserDto(user));
        }
        return result;
    }

    @Override
    public UserDto getUserById(int id) {
        for(User user : users) {
            if(user.getId() == id) {
                return UserMapper.toUserDto(user);
            }
        }
        throw new NotFoundException("User không tồn tại trong hệ thống. :'(");
    }

    @Override
    public List<UserDto> searchUser(String keyword) {
        List<UserDto> result = new ArrayList<>();
        for (User user: users) {
            if (user.getName().contains(keyword)) {
                result.add(UserMapper.toUserDto(user));
            }
        }
        return result;
    }
}
