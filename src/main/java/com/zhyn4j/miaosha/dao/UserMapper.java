package com.zhyn4j.miaosha.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Mapper
@Component

public interface UserMapper {


    /**
     * 获取所有用户
     * @return 用户信息
     */
    List<Map> getUserList();

}
