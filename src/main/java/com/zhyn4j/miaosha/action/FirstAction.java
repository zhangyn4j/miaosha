package com.zhyn4j.miaosha.action;

import com.zhyn4j.miaosha.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class FirstAction {


    @Autowired
    private UserMapper userMapper;


    @RequestMapping("/")
    public String home(){
       List<Map> list =  userMapper.getUserList();
        Map  m = new HashMap();
        if (list.size()>0){
            m = list.get(0);
       }

        return "hello world!!!"+m.toString();
    }


}
