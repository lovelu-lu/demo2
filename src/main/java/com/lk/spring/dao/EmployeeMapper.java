package com.lk.spring.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lk.spring.bean.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper extends BaseMapper<User> {

     int insert(User user);



}
