package com.github.zhouzhu.dao;

import com.github.zhouzhu.entity.Account;
import org.beetl.sql.core.annotatoin.SqlStatement;
import org.beetl.sql.core.mapper.BaseMapper;

public interface AccountDao extends BaseMapper<Account>{
    @SqlStatement(params = "name")
    Account selectAccountByName(String name);
}
