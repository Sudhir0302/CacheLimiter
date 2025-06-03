package com.sudhir03.redisproxy.service;

import com.sudhir03.redisproxy.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService
{
    String pre="user:";

    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    public void saveUser(User user){
        redisTemplate.opsForValue().set(pre+user.getId(),user);
    }

    public User getUser(String id)
    {
        return (User) redisTemplate.opsForValue().get(pre+id);
    }
}
