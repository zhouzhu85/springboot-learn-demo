package com.github.zhouzhu.service;

import com.github.zhouzhu.dao.AccountMapper2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName: AccountService2
 * @author:zhouzhu
 * @Date: 2018/8/27 15:31
 * @Version: V1.0
 */
@Service
public class AccountService2 {
    @Autowired
    AccountMapper2 accountMapper2;

    @Transactional
    public void transfer() throws RuntimeException{
        //用户1减10块，用户2加10
        accountMapper2.update(90,1);
        int i=1/0;
        accountMapper2.update(110,2);
    }
}
