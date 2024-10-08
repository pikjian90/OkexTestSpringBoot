package com.example.demo.Controller;

import com.example.demo.bean.JsonResult;
import jakarta.annotation.Resource;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/jsonresult")
public class JsonResultController {
    @Resource
    RedisTemplate<String,String> redisTemplate;


    @GetMapping("/redis/searchtestresult")
    public JsonResult getTestResultByKeyword(@RequestParam(value="name", defaultValue = "*") String name){
        Map<String,String>  res = new HashMap<>();
        Set<String> set =  redisTemplate.keys("*" + name + "*") ;
        for(String s : set){
            res.put(s,redisTemplate.opsForValue().get(s));
        }

        return new JsonResult(res);
    }

    @GetMapping("/redis/alltestresult")
    public JsonResult getTestResult(){
        Map<String,String>  res = new HashMap<>();
        Set<String> set =  redisTemplate.keys("*") ;
        for(String s : set){
            res.put(s,redisTemplate.opsForValue().get(s));
        }

        return new JsonResult(res);
    }

    @GetMapping("/redis/countalltestresult")
    public JsonResult getValue(){
        Map<String,Integer> res = new HashMap<>();
        int passedCount = 0;
        int failedCount = 0;
        int totalCount = 0;
        Set<String> set =  redisTemplate.keys("*") ;
        for(String s : set){
            if(redisTemplate.opsForValue().get(s).equals("pass")){
                passedCount++;
            }
            else if(redisTemplate.opsForValue().get(s).equals("fail")){
                failedCount++;
            }
            totalCount++;

            res.put("Passed",passedCount);
            res.put("Failed",failedCount);
            res.put("Total",totalCount);

        }
        return new JsonResult(res) ;
    }
}
