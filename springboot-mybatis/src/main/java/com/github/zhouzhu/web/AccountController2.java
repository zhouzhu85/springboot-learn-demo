package com.github.zhouzhu.web;

import com.github.zhouzhu.service.AccountService2;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: AccountController2
 * @author:zhouzhu
 * @Date: 2018/8/27 15:42
 * @Version: V1.0
 */
@RestController
public class AccountController2 {
    @Autowired
    private AccountService2 accountService2;

    @RequestMapping("transfer")
    public String transfer(){
        accountService2.transfer();
        return "1";
    }
}
