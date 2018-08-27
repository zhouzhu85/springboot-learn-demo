package com.github.zhouzhu.service;

import com.github.zhouzhu.entity.Account;

import java.util.List;

public interface AccountService {
    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();
}
