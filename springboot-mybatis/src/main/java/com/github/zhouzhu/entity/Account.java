package com.github.zhouzhu.entity;

/**
 * @ClassName: Account
 * @author:zhouzhu
 * @Date: 2018/8/27 11:01
 * @Version: V1.0
 */
public class Account {
    private Integer id;

    private String name;

    private Double money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
