package com.github.zhouzhu.service;

import com.github.zhouzhu.dao.AccountDao;
import com.github.zhouzhu.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: AccountImpl
 * @author:zhouzhu
 * @Date: 2018/8/27 10:31
 * @Version: V1.0
 */
@Service
public class AccountImpl implements AccountService{
    @Autowired
    AccountDao accountDAO;
    @Override
    public int add(Account account) {
        return accountDAO.add(account);
    }

    @Override
    public int update(Account account) {
        return accountDAO.update(account);
    }

    @Override
    public int delete(int id) {
        return accountDAO.delete(id);
    }

    @Override
    public Account findAccountById(int id) {
        return accountDAO.findAccountById(id);
    }

    @Override
    public List<Account> findAccountList() {
        return accountDAO.findAccountList();
    }
}
