package com.github.zhouzhu.dao;

import com.github.zhouzhu.entity.Account;

import java.util.List;

/**
 * @ClassName: AccountDap
 * @author:zhouzhu
 * @Date: 2018/8/27 10:07
 * @Version: V1.0
 */
public interface AccountDao {
    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();
}
