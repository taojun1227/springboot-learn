package com.jt.learn.springbootlearndemo04mybatis.mapper;

import com.jt.learn.springbootlearndemo04mybatis.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>Title: UserMapper </p>
 *
 * <p>Description:  </p>
 *
 * <p>Company: </p>
 *
 * <p>date: 2020/9/19 17:29 </p>
 *
 * @author: jt-ape
 */
@Mapper
public interface UserMapper {

    @Select("select * from user")
    public List<User> queryList();

}
