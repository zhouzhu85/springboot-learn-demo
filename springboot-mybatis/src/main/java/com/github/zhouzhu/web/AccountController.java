package com.github.zhouzhu.web;

import com.github.zhouzhu.entity.Account;
import com.github.zhouzhu.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName: AccountController
 * @author:zhouzhu
 * @Date: 2018/8/27 15:01
 * @Version: V1.0
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<Account> getAccount(){
        return accountService.findAccountList();
    }

    @RequestMapping("/{id}")
    public Account getAccountByid(@PathVariable("id") int id){
        return accountService.findAccount(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String updateAccount(@PathVariable("id") int id, @RequestParam(value = "name", required = true) String name,
                                @RequestParam(value = "money", required = true) double money) {
        int t = accountService.update(name, money, id);
        if (t == 1) {
            return "success";
        } else {
            return "fail";
        }
    }

    @RequestMapping(value = "",method = RequestMethod.POST)
    public String postAccount(@RequestParam("name") String name, @RequestParam("money") double money){
        int t=accountService.add(name,money);
        if (t==1){
            return "success";
        }else{
            return "fail";
        }
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable(value = "id")int id) {
        int t= accountService.delete(id);
        if(t==1) {
            return "success";
        }else {
            return "fail";
        }

    }

}
