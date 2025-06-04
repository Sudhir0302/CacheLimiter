package com.sudhir03.redisproxy.service;

import com.sudhir03.redisproxy.model.User;
import com.sudhir03.redisproxy.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService
{
    String pre="user:";

    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    @Autowired
    private UserRepo userRepo;

    public User saveUser(User user){
//        redisTemplate.opsForValue().set(pre+user.getId(),user);
        return userRepo.save(user);
    }

    @Cacheable(value ="user",key = "#id")
    public User getUser(int id)
    {
//        return (User) redisTemplate.opsForValue().get(pre+id);
        Optional<User> user=userRepo.findById(id);
        return user.get();
    }
}
