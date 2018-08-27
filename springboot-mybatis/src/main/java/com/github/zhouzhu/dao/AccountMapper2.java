package com.github.zhouzhu.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 基于xml实现数据访问
 */
@Mapper
public interface AccountMapper2 {
    int update(@Param("money") double money,@Param("id") int id);
}
