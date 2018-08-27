package com.github.zhouzhu.dao;

import com.github.zhouzhu.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ClassName: AccountDao
 * @author:zhouzhu
 * @Date: 2018/8/27 11:03
 * @Version: V1.0
 */
public interface AccountDao extends JpaRepository<Account,Integer>{
}
