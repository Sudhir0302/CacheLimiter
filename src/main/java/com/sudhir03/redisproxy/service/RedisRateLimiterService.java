package com.sudhir03.redisproxy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.time.Duration;

@Service
public class RedisRateLimiterService
{
    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    private final int lmt=5;

    private final Duration TIME_WINDOW = Duration.ofMinutes(1);

    public boolean isAllowed(String key){
        String redisKey = "rate_limit:" + key;
        Long count = redisTemplate.opsForValue().increment(redisKey);

//        System.out.println(TIME_WINDOW);  output : PT1M = Period Time 1 Minute

        if (count == 1) {
            redisTemplate.expire(redisKey, TIME_WINDOW);
        }

        return count <= lmt;
    }

}
